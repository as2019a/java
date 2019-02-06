package com.inc.bluemarble;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class BlueMarble extends JFrame {

	private Player player;
	private Player tempPlayer;
	private CardLayout cardLayout;

	private JPanel gamePanel; // 카드레이아웃으로 세팅(전체 패널?)
	private JPanel gameMainPanel; // 브루마블 메인 화면 패널
	private JPanel choosecharactorPanel; // 캐릭터 선택 화면 패널
	private JPanel soutPanel;
	private JPanel chatPanel;

	private ButtonGroup btnGroup;
	private JRadioButton charactorRadioBtn1, charactorRadioBtn2, charactorRadioBtn3;
	private JLabel charatorImageLabel;

	private JLabel[][] map;

	private JButton runBtn;
	private JButton sendBtn;

	private JTextArea chatArea;
	private JTextField chatField;

	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	private Thread msgReceiver;
	private List<Country> country;

	private static final int row = 8;
	private static final int column = 8;
	private static final int length = 20;

	private boolean myTurn;
	private String nickName;

	private Timer t;
	private int rd;
	private Point prevPoint = new Point();
	private int index = 0;

	private BlueMarble() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 100, 813, 760);
		setResizable(false);
		initSocket();
		showDiceImage();
		initCountry();
		initComponent();
		initMessageReceiver();
		initEvent();
		initGamingEvent();
		setVisible(true);
	}

	private void scrollDown() {
		chatArea.setCaretPosition(chatArea.getDocument().getLength());
	}

	private void initMessageReceiver() {
		msgReceiver = new Thread() {

			@Override
			public void run() {
				while (true) {
					try {
						Message message = (Message) ois.readObject();
						if (message.getType() == Message.EXIT) {
							oos.close();
							ois.close();
							socket.close();
							return;
						} else if (message.getType() == Message.START) {
							chatArea.append(message.getNickName() + "님이 입장하셨습니다.\n");
							scrollDown();
							continue;
						} else if (message.getType() == Message.PLAYER) {
							
							changeImage(message);
							continue;
						} else {
							chatArea.append(message.getNickName() + " : " + message.getMsg() + "\n");
							scrollDown();
						}
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}

		};

		msgReceiver.start();
	}

	private void showDiceImage() {
		t = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rd = (int) (Math.random() * 6) + 1;
				map[3][3].setIcon(new ImageIcon("src/com/inc/images/dice/dice" + rd + ".jpg"));
			}
		});
	}

	private void moveMap() {
		int tempx;
		int tempy;
		prevPoint.x = player.x;
		prevPoint.y = player.y;
		
		if (player.x == 0 && player.y < column) { // 위쪽
			if (player.y + rd < column) {
				player.y += rd;
			} else if (player.y + rd >= column) {
				tempx = row - 1 - player.y;
				tempy = rd - tempx;
				player.x += tempy;
				player.y = column - 1;
			}
		} else if (player.x < row && player.y == column - 1) { // 오른쪽
			if (player.x + rd < row) {
				player.x += rd;
			} else if (player.x + rd >= row) {
				tempy = column - 1 - player.x;
				tempx = tempy - rd;
				player.y += tempx;
				player.x = row - 1;
			}
		} else if (player.x == row - 1 && player.y < column) { // 아래쪽
			if (player.y - rd >= 0) {
				player.y -= rd;
			} else if (player.y - rd < 0) {
				tempx = player.y;
				tempy = rd - tempx;
				player.x -= tempy;
				player.y = 0;
			}

		} else if (player.x < row && player.y == 0) { // 왼쪽
			if (player.x - rd >= 0) {
				player.x -= rd;
			} else if (player.x - rd < 0) {
				tempy = player.x;
				tempx = tempy - rd;
				player.y -= tempx;
				player.x = 0;
			}
		}

		try {
			Message message = new Message(nickName, null, player, Message.PLAYER);
			oos.writeObject(message);
			oos.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(rd); // 테스트
	}

	private void changeImage(Message message) {
		System.out.println(player.x + ":" + player.y);
		Country c = country.get(index);
		System.out.println(c.getImage());
		map[prevPoint.x][prevPoint.y].setIcon(c.getImage());
		map[message.player.x][message.player.y].setIcon(new ImageIcon("src/com/inc/images/changemap/mariooooo.png"));
		index += rd;
	//	index %= 28;
	}


	private void initGamingEvent() {
		runBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				if ("Dice".equals(runBtn.getText())) {
					t.start();
					runBtn.setText("STOP");
				} else if ("STOP".equals(runBtn.getText())) {
					t.stop();
					moveMap();
					runBtn.setText("Dice!");
				} else if ("Dice!".equals(runBtn.getText())) {
					t.restart();
					runBtn.setText("STOP");
				}
				 System.out.println(rd);
			}
		});
	}

	private void initPlayer() {
		for (Enumeration<AbstractButton> radioBtns = btnGroup.getElements();;) {
			AbstractButton btn = radioBtns.nextElement();
			if (btn.isSelected()) {
				player = new Player(new ImageIcon("src/com/inc/images/character/"+btn.getText() + ".png"), btn.getText());
				System.out.println("player 생성");	//테스트
				break;
			}
		}
	}
	
	private void selectedViewImage() {
		for (Enumeration<AbstractButton> radioBtns = btnGroup.getElements();;) {
			AbstractButton btn = radioBtns.nextElement();
			if (btn.isSelected()) {
				System.out.println(btn.getText());	//테스트
				charatorImageLabel.setIcon(new ImageIcon("src/com/inc/images/character/" + btn.getText() + ".png"));
				break;
			}
		}
	}
	private void initEvent() {

		sendBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				if (sendBtn.getText().equals("입장하기")) {
					while ((nickName = JOptionPane.showInputDialog("닉네임")).equals("")) {
					}
					initPlayer();
					sendBtn.setText("나가기");
					chatField.setEditable(true);
					chatField.requestFocus();
					cardLayout.show(gamePanel, "main");
					try {

						Message message = new Message(nickName, null, null, Message.START);
						oos.writeObject(message);
						oos.reset();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(getContentPane(), "서버 장애입니다.\n계속되면 관리자에게 문의해 주세요.");
						System.exit(0);
					}

				} else {
					Message message = new Message(nickName, null, null, Message.EXIT); // 종료
					try {
						oos.writeObject(message);
						oos.reset();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					System.exit(0);
				}

			}
		});

		chatField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						oos.writeObject(new Message(nickName, chatField.getText(), null, Message.SEND));
						chatField.setText("");
						oos.reset();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}
			}

		});

	}

	private void initSocket() {
		socket = new Socket();
		try {
			socket.connect(new InetSocketAddress("192.168.0.13", 5001));
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());

		} catch (IOException e) {
			JOptionPane.showMessageDialog(getContentPane(), "서버 장애입니다.\n계속되면 관리자에게 문의해 주세요.");
			System.exit(0);
		}
	}

	

	private void initCountry() {
		country = new ArrayList<>();
		Country korea = new Country("Korea", Country.korea, new ImageIcon("src/com/inc/images/map2/korea.png"));
		Country start = new Country("start", Country.NO_COUNTRY, new ImageIcon("src/com/inc/images/map2/start.png"));
		Country bangladesh = new Country("Bangladesh", Country.bangladesh,
				new ImageIcon("src/com/inc/images/map2/Bangladesh.png"));
		Country brazil = new Country("Brazil", Country.brazil, new ImageIcon("src/com/inc/images/map2/Brazil.png"));
		Country canada = new Country("Canada", Country.canada, new ImageIcon("src/com/inc/images/map2/Canada.png"));
		Country chile = new Country("Chile", Country.chile, new ImageIcon("src/com/inc/images/map2/Chile.png"));
		Country china = new Country("china", Country.china, new ImageIcon("src/com/inc/images/map2/china.png"));
		Country travelWorld = new Country("travelWorld", Country.NO_COUNTRY,
				new ImageIcon("src/com/inc/images/map2/travelWorld.png"));
		Country finland = new Country("Finland", Country.finland, new ImageIcon("src/com/inc/images/map2/Finland.png"));
		Country france = new Country("France", Country.france, new ImageIcon("src/com/inc/images/map2/France.png"));
		Country germany = new Country("Germany", Country.germany, new ImageIcon("src/com/inc/images/map2/Germany.png"));
		Country ghana = new Country("Ghana", Country.ghana, new ImageIcon("src/com/inc/images/map2/Ghana.png"));
		Country india = new Country("India", Country.india, new ImageIcon("src/com/inc/images/map2/India.png"));
		Country japan = new Country("japan", Country.japan, new ImageIcon("src/com/inc/images/map2/japan.png"));
		Country libya = new Country("Libya", Country.libya, new ImageIcon("src/com/inc/images/map2/Libya.png"));
		Country nepal = new Country("Nepal", Country.nepal, new ImageIcon("src/com/inc/images/map2/Nepal.png"));
		Country newzealand = new Country("NewZealand", Country.newzealand,
				new ImageIcon("src/com/inc/images/map2/NewZealand.png"));
		Country nigeria = new Country("Nigeria", Country.nigeria, new ImageIcon("src/com/inc/images/map2/Nigeria.png"));
		Country pakistan = new Country("Pakistan", Country.pakistan,
				new ImageIcon("src/com/inc/images/map2/Pakistan.png"));
		Country peru = new Country("Peru", Country.peru, new ImageIcon("src/com/inc/images/map2/Peru.png"));
		Country uninhabitedIsland = new Country("uninhabitedIsland", Country.NO_COUNTRY, new ImageIcon("src/com/inc/images/map2/uninhabitedIsland.png"));
		Country russia = new Country("Russia", Country.russia, new ImageIcon("src/com/inc/images/map2/Russia.png"));
		Country saudiarabia = new Country("SaudiArabia", Country.saudiarabia,
				new ImageIcon("src/com/inc/images/map2/SaudiArabia.png"));
		Country singapore = new Country("Singapore", Country.singapore,
				new ImageIcon("src/com/inc/images/map2/Singapore.png"));
		Country thailand = new Country("Thailand", Country.thailand,
				new ImageIcon("src/com/inc/images/map2/Thailand.png"));
		Country unitedkingdom = new Country("UnitedKingdom", Country.unitedkingdom,
				new ImageIcon("src/com/inc/images/map2/UnitedKingdom.png"));
		Country uruguay = new Country("Uruguay", Country.uruguay, new ImageIcon("src/com/inc/images/map2/Uruguay.png"));
		Country usa = new Country("Usa", Country.usa, new ImageIcon("src/com/inc/images/map2/Usa.png"));
		
		country.add(start);
		country.add(korea);
		country.add(bangladesh);
		country.add(brazil);
		country.add(canada);
		country.add(chile);
		country.add(china);
		country.add(travelWorld);
		country.add(finland);
		country.add(france);
		country.add(germany);
		country.add(ghana);
		country.add(india);
		country.add(japan);
		country.add(libya);
		country.add(nepal);
		country.add(newzealand);
		country.add(nigeria);
		country.add(pakistan);
		country.add(peru);
		country.add(uninhabitedIsland);
		country.add(russia);
		country.add(saudiarabia);
		country.add(singapore);
		country.add(thailand);
		country.add(unitedkingdom);
		country.add(uruguay);
		country.add(usa);

	}

	private void initComponent() {
		ActionListener a = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedViewImage();
			}
		};

		cardLayout = new CardLayout();
		gamePanel = new JPanel(cardLayout);

		// 마블 판
		gameMainPanel = new JPanel(new GridLayout(row, column));
		map = new JLabel[row][column];
		Iterator<Country> k = country.iterator();
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				JLabel jlabel = new JLabel();
				map[i][j] = jlabel;

				if (i >= 1 && j >= 1 && i < map.length - 1 && j < map.length - 1) { // 가운데 빈공간
					jlabel.setIcon(new Country(null, Country.NO_COUNTRY,
							new ImageIcon("src/com/inc/images/map/background.png")).getImage());
				} else { // 나라들
					if (k.hasNext()) {
						Country w = k.next();
						jlabel.setIcon(w.getImage());
					}
				}
				gameMainPanel.add(jlabel);
			}
		}

		chatPanel = new JPanel(new BorderLayout());
		soutPanel = new JPanel(new BorderLayout());

		sendBtn = new JButton("입장하기");
		runBtn = new JButton("Dice");
		chatArea = new JTextArea(6, 1);
		chatArea.setEditable(false);
		chatField = new JTextField();
		chatField.setEditable(false);

		choosecharactorPanel = new JPanel(new BorderLayout());
		charatorImageLabel = new JLabel();
		btnGroup = new ButtonGroup();

		charactorRadioBtn1 = new JRadioButton("mario", true);
		charactorRadioBtn2 = new JRadioButton("ruigi");
		charactorRadioBtn3 = new JRadioButton("foo");

		btnGroup.add(charactorRadioBtn1);
		btnGroup.add(charactorRadioBtn2);
		btnGroup.add(charactorRadioBtn3);

	

		charactorRadioBtn1.setBounds(100, 10, 150, 50);
		charactorRadioBtn2.setBounds(350, 10, 150, 50);
		charactorRadioBtn3.setBounds(600, 10, 150, 50);
		charactorRadioBtn1.addActionListener(a);
		charactorRadioBtn2.addActionListener(a);
		charactorRadioBtn3.addActionListener(a);
		
		charatorImageLabel.setBounds(10, 60, 580, 320); // 캐릭터 이미지 레이블
		
		choosecharactorPanel.add(charactorRadioBtn1); // 라디오버튼
		choosecharactorPanel.add(charactorRadioBtn2);
		choosecharactorPanel.add(charactorRadioBtn3);
		choosecharactorPanel.add(charatorImageLabel);

		chatPanel.add(chatField);
		chatPanel.add(sendBtn, BorderLayout.EAST);

		soutPanel.add(new JScrollPane(chatArea));
		soutPanel.add(runBtn, BorderLayout.EAST);
		soutPanel.add(chatPanel, BorderLayout.SOUTH);

		gamePanel.add(choosecharactorPanel, "choice");
		gamePanel.add(gameMainPanel, "main");

		add(gamePanel);
		add(soutPanel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		new BlueMarble();
	}

}
