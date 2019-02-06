package NyamNyam.v5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.net.ssl.HostnameVerifier;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameFrame extends JFrame{
	
	JMenuBar menuBar;
	
	JMenu setMenu;
	JMenuItem loginItem;
	JMenuItem exitItem;
	
	JButton startBtn;
	JButton restartBtn;
	JButton mainBtn;
	
	JMenu helpMenu;
	JMenuItem createrItem;
	
	
	JPanel gamePanel;
	JPanel startPanel;
	
	
	ImageIcon playerImage;
	ImageIcon coinImage;
	ImageIcon scoreImage;
	ImageIcon farbackgroundImage;
	ImageIcon nearbackgroundImage;
	ImageIcon guageBg;
	ImageIcon guageBar;
	
	JPanel scorePanel;
	JPanel resultPanel;
	
	JLabel scoreLabel;
	
	Point playerPoint = new Point(50, 300);
	
	Timer t;
	Timer t1;
	Timer t2;
	Timer t3;
	
	List<Point> points = new Vector<>();
	
	boolean keyPressing = false;
	
	int score;
	int farbackground_x = 0;
	int nearbackground_x = 0;
	int guageBar_x = 412;
	int score_x = 590;

	private ImageIcon titleImage;

	
	private GameFrame() {
		setIconImage(new ImageIcon("src/images/36.png").getImage());
		setTitle("Witch`s Story");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,150,1280,800);
		initComponent();
		initEvent();
		setVisible(true);
		setResizable(false);
		setTimer();
		setPoints();
		movefarBackground();
		movenearBackground();
		while(true) {
			if(guageBar_x <= 0) {
				points.removeAll(points);
				gameStop();
				mainBtn.setVisible(true);
				restartBtn.setVisible(true);
				revalidate();
				repaint();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	
	
	private void gameStop() {
		t.stop();
		t1.stop();
		t2.stop();
		t3.stop();
	}

	private void gameStart() {
		add(gamePanel);
		revalidate();
		repaint();
		t.start();
		t1.start();
		t2.start();
		t3.start();
		requestFocus();
	}

	private void movenearBackground() {
		t3 = new Timer(20, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nearbackground_x -= 8;
				if(nearbackground_x == -320) {
					nearbackground_x = 0;
				}
			}
		});
	}


	private void movefarBackground() {
		t2 = new Timer(80 , new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				farbackground_x -= 1;
				if(farbackground_x==-1280) {
					farbackground_x = 0;
				}
				guageBar_x -= 4;
			}
		});
		
	}


	private void setPoints() {
		t1 = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				points.add(new Point(1300,(int)(Math.random()*550)+100));
				
			}
		});
	}


	private void setTimer() {
		t = new Timer(20, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!keyPressing) {
					if(playerPoint.y > 545) {playerPoint.y = playerPoint.y; }
					else {playerPoint.y += 8;}
				}else if(keyPressing){
					if(playerPoint.y < 20) {playerPoint.y = playerPoint.y; }
					else {playerPoint.y -= 12;} 
				}
				gamePanel.repaint();
				synchronized(points) {
					for(Iterator<Point> i = points.iterator();i.hasNext();) {
						Point p = i.next();
						p.x -= 10;
						
						if(isCrashed(p)) {
							i.remove();
							score += 1000;
							switch(score) {
								case 1000 : score_x = 580; break;
								case 10000 : score_x = 570; break;
								case 100000 : score_x = 560; break;
								case 1000000 : score_x = 550; break;
							}
						}
						
						if(p.x < 0) {
							i.remove();
						}
					}
				}
				
			}

			
			
		});
		
	}

	private boolean isCrashed(Point p) {
		if(Math.sqrt(Math.pow((p.x-36)-(playerPoint.x+120), 2)+(Math.pow((p.y-36)-(playerPoint.y+60), 2))) < 100){
			return true;
		}
		return false;
	}
	
	private void initEvent() {
		startBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				startBtn.setIcon(new ImageIcon("src/images/PlayBtn2.png"));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startBtn.setIcon(new ImageIcon("src/images/PlayBtn.png"));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				startBtn.setIcon(new ImageIcon("src/images/PlayBtn.png"));
				remove(startPanel);
				gameStart();
				
			}
		});
		
		mainBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				remove(gamePanel);
				reset();
				add(startPanel);
				revalidate();
				repaint();
			}

			
		});
		
		restartBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				add(gamePanel);
				reset();
				revalidate();
				repaint();
				gameStart();
			}

			
		});
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					keyPressing = true;
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE){
					keyPressing = false;
				}
			}
			
		});
	}

	private void reset() {
		score = 0;
		farbackground_x = 0;
		nearbackground_x = 0;
		guageBar_x = 412;
		score_x = 590;
		mainBtn.setVisible(false);
		restartBtn.setVisible(false);
	}
	
	private void initComponent() {
		playerImage = new ImageIcon("src/images/player.png");
		coinImage = new ImageIcon("src/images/Enemy_1_pumkin.png");
		scoreImage = new ImageIcon("src/images/score.png");
		farbackgroundImage = new ImageIcon("src/images/farbackground.png");
		nearbackgroundImage = new ImageIcon("src/images/nearbackground.png");
		guageBg = new ImageIcon("src/images/GuageBG.png");
		guageBar = new ImageIcon("src/images/GuageBar.png");
		titleImage = new ImageIcon("src/images/Lobby_Title.png");
		

		menuBar = new JMenuBar();
		setMenu = new JMenu("설정");
		loginItem = new JMenuItem("로그인");
		exitItem = new JMenuItem("종료");
		helpMenu = new JMenu("정보");
		createrItem = new JMenuItem("제작자");
		
		setMenu.add(loginItem);
		setMenu.add(exitItem);
		helpMenu.add(createrItem);
		
		menuBar.add(setMenu);
		menuBar.add(helpMenu);
		
		
		add(menuBar,BorderLayout.NORTH);
		/*scorePanel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.drawImage(scoreImage.getImage(), 0, 0, this);
				g.setColor(Color.WHITE);
				g.setFont(new Font("Rosewood Std",Font.PLAIN,35));
				g.drawString(""+score, 90,55);
				setOpaque(false);
			}
			
		};*/
		
		
		startPanel = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(farbackgroundImage.getImage(), farbackground_x, 0, this);
				g.drawImage(titleImage.getImage(), 400, 100, 448, 306, this);
			}
			
		};
		startPanel.setLayout(null);
		
		startBtn = new JButton(new ImageIcon("src/images/PlayBtn.png"));
		startBtn.setBounds(530,450,200,50);
		startBtn.setBorderPainted(false); 
		startBtn.setFocusPainted(false);
		startBtn.setContentAreaFilled(false);
		
		
		startPanel.add(startBtn);
		
		gamePanel = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(farbackgroundImage.getImage(), farbackground_x, 0, this);
				g.drawImage(farbackgroundImage.getImage(), farbackground_x+farbackgroundImage.getIconWidth(), 0, this);
				g.drawImage(nearbackgroundImage.getImage(),nearbackground_x,350,this);
				g.drawImage(nearbackgroundImage.getImage(),nearbackground_x+nearbackgroundImage.getIconWidth(),350,this);
				
				g.drawImage(guageBg.getImage(),400, 700,this);
				g.drawImage(guageBar.getImage(), 445, 716,guageBar_x,17, this);
				g.drawImage(playerImage.getImage(), playerPoint.x, playerPoint.y, this);
				synchronized(points) {
					for(Point p : points) {
						g.drawImage(coinImage.getImage(), p.x-36,p.y-36, this);
					}
				}
				if(guageBar_x <= 0) {
				g.setColor(new Color(0f,0f,0f,0.5f));
				g.fillRect(0, 0, 1280, 800);
				g.setColor(new Color(255,255,255));
				g.setFont(new Font("Verdana", Font.PLAIN, 50));
				g.drawString("YOUR SCORE IS", 430, 200);
				g.drawString("     "+score, 475, 300);
				}else {
					g.drawImage(scoreImage.getImage(), 500, 10, this);
					g.setColor(Color.WHITE);
					g.setFont(new Font("Verdana",Font.PLAIN,35));
					g.drawString(score+"", score_x,65);
				}
			}
			
		};
		gamePanel.setLayout(null);
		//gamePanel.add(scorePanel);
		
		/*scorePanel.setBounds(500,10,205,72);
		scorePanel.setBackground(Color.black);
		scorePanel.repaint();
		
		scoreLabel = new JLabel("0");
		scoreLabel.setFont(new Font("Rosewood Std",Font.PLAIN,30));
		scoreLabel.setForeground(Color.WHITE);
		scorePanel.add(scoreLabel);*/
		/*resultPanel = new JPanel() {
			
			protected void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				g2.fillRect(300, 400, 40, 40);
				Color c = new Color(0f,0f,0f,0.7f);
				g2.setColor(c);
				g2.fillRect(0, 0, 1280, 800);
			}

		};
		resultPanel.setBounds(0,0,1280,800);*/
		
		restartBtn = new JButton(new ImageIcon("src/images/BtnSource.png"));
		restartBtn.setBounds(250,450,293,94);
		restartBtn.setBorderPainted(false); 
		restartBtn.setFocusPainted(false);
		restartBtn.setContentAreaFilled(false);
		mainBtn = new JButton(new ImageIcon("src/images/BtnSource1.png"));
		mainBtn.setBounds(700,450,293,94);
		mainBtn.setBorderPainted(false); 
		mainBtn.setFocusPainted(false);
		mainBtn.setContentAreaFilled(false);
		restartBtn.setVisible(false);
		mainBtn.setVisible(false);
		
		gamePanel.add(restartBtn);
		gamePanel.add(mainBtn);
		
		add(startPanel);
	}


	public static void main(String[] args) {
		new GameFrame();
	}
	 
}
