package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarOutputStream;

import javax.print.attribute.standard.JobState;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Maze5 extends JFrame {
	int[][] map = {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//0
			{0,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},//1
			{0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,1,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0},//2
			{1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1,1,1,1,0,0,1,1,1,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0},//3
			{1,1,1,1,1,0,1,0,0,0,1,1,1,0,0,0,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,0,2,1,0,1,0},//4
			{0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1,0,0,0,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0},//5
			{0,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,0,1,0,1,0,1,2,1,1,0,1,0,0,1,0,1,0,1,1,0,1,0,0,0,0,0,0,0,1,0,1,0},//6
			{0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,1,0,0,0,0,1,1,1,1,1,1,1,0,1,0},//7
			{0,1,0,1,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0},//8
			{0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,0,0,1,0,1,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0},//9
			{1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,0,1,0,1,0},//10
			{1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1,0},//11
			{1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0},//12
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0},//13
			{0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,2,0,1,0,1,0,1,0},//14
			{0,0,0,0,1,0,2,1,0,0,1,2,0,1,0,0,0,1,0,1,0,1,0,0,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1,0},//15
			{0,1,0,0,0,0,1,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,1,0},//16
			{0,1,1,1,1,1,1,1,0,0,1,1,0,1,0,1,2,1,0,1,0,1,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0},//17
			{0,1,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,1,0,1,0,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0},//18
			{0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0},//19
			{0,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//20
			{0,0,0,0,0,1,0,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},//21
			{0,1,0,1,0,0,0,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0},//22
			{0,1,1,1,1,1,1,0,0,0,1,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0},//23
			{1,0,0,0,0,0,0,0,1,0,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0},//24
			{1,0,1,1,1,1,1,0,1,0,1,1,0,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//25
			{1,0,1,2,2,2,1,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,1,0,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//26
			{1,0,1,0,1,0,1,0,1,0,1,1,0,0,0,1,0,1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,2},//27
			{1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1},//28
			{1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,1,0,0,1,0,1,2,1,0,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},//29
			{1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,1,0,1,0,1,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},//30
			{1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,2,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//31
			{1,0,1,0,1,0,1,0,1,0,1,0,0,1,1,1,0,1,0,0,0,1,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,2},//32
			{1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,2,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,1},//33
			{0,0,0,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,1,0,0,1,0,1,0,1,1,1,0,0,0,0,0,2,1,1,1,1,1,1,1,1,1,0,0,0,1,2},//34
			{0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,2,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0},//35
			{0,1,0,0,0,0,1,0,0,0,1,1,2,1,1,1,0,1,1,0,1,2,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1},//36
			{0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,2,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,0,2},//37
			{0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},//38
	};

	final ImageIcon wall = new ImageIcon("src/project1/wall.png");
	final ImageIcon rebon = new ImageIcon("src/project1/리본.jpg");
	final ImageIcon unitIcon1 = new ImageIcon("src/project1/enemy1.png");
	final ImageIcon unitIcon2 = new ImageIcon("src/project1/enemy2.png");
	final ImageIcon unitIcon3 = new ImageIcon("src/project1/enemy3.png");
	final ImageIcon unitIcon4 = new ImageIcon("src/project1/enemy4.png");
	List<Block> blockList = new ArrayList<>();
	List<Unit> unitList = new ArrayList<>();
	List<Key> keyList = new ArrayList<>();
	List<Key2> key2List = new ArrayList<>();
	Key key;
	Key2 key1, key2, key3, key4, key5, key6, key7, key8, key9, key10, key11, key12, key13, key14, key15, key16, key17, key18, key19, key20, key21;
	Block block;
	Unit unit1;
	Unit unit2;
	Unit unit3;
	Unit unit4;
	JLabel timeLabel;
	JPanel canvas;
	boolean b = true;
	
	public long time;
	JFrame frame = new JFrame();

	int where;
	int choice;
	Thread work;

	private Maze5() {
		setTitle("Maze Runner");
		setSize(1005, 825);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTimer();
		initComponent();
		initEvent();
		setVisible(true);

		unitmove2(unit1);
		unitmove(unit2);
		unitmove(unit3);
		unitmove(unit4);

	}
	
	
	private void setTimer() {
		startMsg();
		work = new Thread() {
			@Override
			public void run() {
				for (time = 60; time > 0; time--) {
					try {
						Thread.sleep(1000);
					//canvas.repaint();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		work.start();
		requestFocus();
	}

	
	private void startMsg() {
		JOptionPane.showMessageDialog(getContentPane(), "참고! : 조그만해서 잘 안보임 \n 방향키와 엔터 혹은 스페이스바 키를 사용하세요 \n 확인버튼을 누르면 게임시작", 
				"내 캐릭터를 소개합니다", 0 , rebon );
		//오른쪽상단 x 누르면 게임종료
	}
	
	private void gKey(Key2 key, Graphics g) {
		g.setColor(key.getC());
		g.fillRoundRect(key.p.x, key.p.y, 12, 12, 50, 50);
	}
	
	private void randomKey(Key2 key) {
		while (true) {
			int x = (int) (Math.random() * map[0].length);
			int y = (int) (Math.random() * map.length);
			key.p = new Point(x * 20, y * 20);
			if (map[y][x] == 1) {
				continue;
			}
			break;
		}
	}
	
	private void keyPoint(Key key) {
		while (true) {
			int x = (int) (Math.random() * map[0].length);
			int y = (int) (Math.random() * map.length);
			key.p = new Point(x * 20, y * 20);
			if (map[y][x] != 2) {
				continue;
			}
			break;
		}
	}
	
	private void itemKeyEvent5(Key2 key) {
		if (Math.abs(block.p.x - key.p.x) < 8 && Math.abs(block.p.y - key.p.y) < 8) {
			if (keyList.contains(this.key)) {
				time += 5;
				key.p = new Point(-10, -10);
				JOptionPane.showMessageDialog(getContentPane(), "+ 5초");
			}
		} 
	}
	
	private void itemKeyEvent10(Key2 key) {
		if (Math.abs(block.p.x - key.p.x) < 8 && Math.abs(block.p.y - key.p.y) < 8) {
			if (keyList.contains(this.key)) {
				time += 10;
				key.p = new Point(-10, -10);
				JOptionPane.showMessageDialog(getContentPane(), "+ 10초");
			}
		} 
	}
	
	private void itemKey(Key2 key) {
		if (Math.abs(block.p.x - key.p.x) < 8 && Math.abs(block.p.y - key.p.y) < 8) {
				if (time > 0 && b == true) {
					this.key.setC(Color.BLUE);
					key.p = new Point(-10, -10);
					JOptionPane.showMessageDialog(getContentPane(), "도착지점힌트를 얻었다 : 파란색점");
				}
		}
	}
	
	private void initEvent() {
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					if ((int) block.p.x <= 20) {
						block.p.x = 20;
					}
					if (map[block.p.y / 20][block.p.x / 20 - 1] == 1) {
						return;
					}
					block.p.x -= 20;
					repaint();
					break;

				case KeyEvent.VK_RIGHT:
					if ((int) block.p.x >= 960) {
						block.p.x = 960;
					}
					if (map[block.p.y / 20][block.p.x / 20 + 1] == 1) {
						return;
					}
					block.p.x += 20;
					repaint();
					break;

				case KeyEvent.VK_UP:
					if ((int) block.p.y <= 20) {
						block.p.y = 20;
					}
					if (map[block.p.y / 20 - 1][block.p.x / 20] == 1) {
						return;
					}
					block.p.y -= 20;
					repaint();
					break;

				case KeyEvent.VK_DOWN:
					if ((int) block.p.y >= 742) {
						block.p.y = 742;
					}
					if (map[block.p.y / 20 + 1][block.p.x / 20] == 1) {
						return;
					}
					block.p.y += 20;
					repaint();
					break;
				}

				if (Math.abs(block.p.x - key.p.x) < 8 && Math.abs(block.p.y - key.p.y) < 8) {
					// 시간 멈추기
					work.stop();
					b = false;
					keyList.remove(key);
					JOptionPane.showMessageDialog(getContentPane(), "승리\n" + time + "초");
					System.exit(0);
				}
				itemKey(key1);
				itemKeyEvent5(key2);
				itemKeyEvent5(key3);
				itemKeyEvent5(key4);
				itemKeyEvent10(key5);
				itemKeyEvent5(key6);
				itemKeyEvent5(key7);
				itemKeyEvent5(key8);
				itemKeyEvent5(key9);
				itemKeyEvent10(key10);
				itemKeyEvent5(key11);
				itemKeyEvent5(key12);
				itemKeyEvent5(key13);
				itemKeyEvent5(key14);
				itemKeyEvent10(key15);
				itemKeyEvent5(key16);
				itemKeyEvent5(key17);
				itemKeyEvent5(key18);
				itemKeyEvent5(key19);
				itemKeyEvent10(key20);
				itemKeyEvent5(key21);
				
				canvas.repaint();
			}

		});
	}

	private void initComponent() {
		String id = "user";
		String keyId = "key";
		String id2 = "enemy";
		block = new Block(id, null);
		unit1 = new Unit(id2, null);
		unit2 = new Unit(id2, null);
		unit3 = new Unit(id2, null);
		unit4 = new Unit(id2, null);
		
		key = new Key(keyId, Color.pink);
		
		key1 = new Key2(keyId, Color.green);
		key2 = new Key2(keyId, Color.yellow);
		key3 = new Key2(keyId, Color.yellow);
		key4 = new Key2(keyId, Color.yellow);
		key5 = new Key2(keyId, Color.yellow);
		key6 = new Key2(keyId, Color.yellow);
		key7 = new Key2(keyId, Color.yellow);
		key8 = new Key2(keyId, Color.yellow);
		key9 = new Key2(keyId, Color.yellow);
		key10 = new Key2(keyId, Color.yellow);
		key11 = new Key2(keyId, Color.yellow);
		key12 = new Key2(keyId, Color.yellow);
		key13 = new Key2(keyId, Color.yellow);
		key14 = new Key2(keyId, Color.yellow);
		key15 = new Key2(keyId, Color.yellow);
		key16 = new Key2(keyId, Color.yellow);
		key17 = new Key2(keyId, Color.yellow);
		key18 = new Key2(keyId, Color.yellow);
		key19 = new Key2(keyId, Color.yellow);
		key20 = new Key2(keyId, Color.yellow);
		key21 = new Key2(keyId, Color.yellow);
		
		block.p = new Point(20, 20);
		unit1.p = new Point(480, 200);
		unit2.p = new Point(200, 100);
		unit3.p = new Point(280, 500);
		unit4.p = new Point(600, 580);
		
		keyPoint(key);
		
		randomKey(key1);
		randomKey(key2);
		randomKey(key3);
		randomKey(key4);
		randomKey(key5);
		randomKey(key6);
		randomKey(key7);
		randomKey(key8);
		randomKey(key9);
		randomKey(key10);
		randomKey(key11);
		randomKey(key12);
		randomKey(key13);
		randomKey(key14);
		randomKey(key15);
		randomKey(key16);
		randomKey(key17);
		randomKey(key18);
		randomKey(key19);
		randomKey(key20);
		randomKey(key21);
		
		blockList.add(block);
		unitList.add(unit1);
		unitList.add(unit2);
		unitList.add(unit3);
		unitList.add(unit4);
		keyList.add(key);
		/*key2List.add(key2);
		key2List.add(key3);
		key2List.add(key4);
		key2List.add(key5);
		key2List.add(key6);
		key2List.add(key7);
		key2List.add(key8);
		key2List.add(key9);
		key2List.add(key10);
		key2List.add(key11);
		key2List.add(key12);
		key2List.add(key13);
		key2List.add(key14);
		key2List.add(key15);
		key2List.add(key16);
		key2List.add(key17);
		key2List.add(key18);
		key2List.add(key19);
		key2List.add(key20);
		key2List.add(key21);*/
	
		timeLabel = new JLabel("");
		add(timeLabel, BorderLayout.SOUTH);
		
		canvas = new JPanel() {

			public void paint(Graphics g) {
				super.paint(g);
				setBackground(Color.pink);

				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < map[i].length; j++) {
						if (map[i][j] == 1) {
							g.drawImage(wall.getImage(), j * 20, i * 20, 20, 20, this);
						}
					}
				}

				g.drawImage(rebon.getImage(), block.p.x, block.p.y, 20, 20, this);
				
				g.setColor(key.getC());
				g.fillRoundRect(key.p.x, key.p.y, 10, 10, 20, 20);
				
					gKey(key1, g);
					gKey(key2, g);
					gKey(key3, g);
					gKey(key4, g);
					gKey(key5, g);
					gKey(key6, g);
					gKey(key7, g);
					gKey(key8, g);
					gKey(key9, g);
					gKey(key10, g);
					gKey(key11, g);
					gKey(key12, g);
					gKey(key13, g);
					gKey(key14, g);
					gKey(key15, g);
					gKey(key16, g);
					gKey(key17, g);
					gKey(key18, g);
					gKey(key19, g);
					gKey(key20, g);
					gKey(key21, g);
				/*g.setColor(key2.getC());
				g.fillRoundRect(key2.p.x, key2.p.y, 12, 12, 50, 50);

				g.setColor(key3.getC());
				g.fillRoundRect(key3.p.x, key3.p.y, 12, 12, 50, 50);
				
				g.setColor(key4.getC());
				g.fillRoundRect(key4.p.x, key4.p.y, 12, 12, 50, 50);
				
				g.setColor(key5.getC());
				g.fillRoundRect(key5.p.x, key5.p.y, 12, 12, 50, 50);*/

				g.drawImage(unitIcon1.getImage(), unit1.p.x, unit1.p.y, 20, 20, this);
				g.drawImage(unitIcon2.getImage(), unit2.p.x, unit2.p.y, 20, 20, this);
				g.drawImage(unitIcon3.getImage(), unit3.p.x, unit3.p.y, 20, 20, this);
				g.drawImage(unitIcon4.getImage(), unit4.p.x, unit4.p.y, 20, 20, this);

				timeLabel.setText(time + "초");

				if (time <= 0 && b == true) {
					b = false;
					JOptionPane.showMessageDialog(getContentPane(), "패배 : 타임아웃");
					System.exit(0);
				}
				unitAct();
			}

		};
		frame.add(canvas);
		add(canvas);
	}


	private void unitAct() {
		if(Math.abs(block.p.x - unit1.p.x) < 15 && Math.abs(block.p.y - unit1.p.y) < 15 && b == true) {
			b = false;
			work.stop();
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 빨강유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit2.p.x) < 15 && Math.abs(block.p.y - unit2.p.y) < 15 && b == true) {
			b = false;
			work.stop();
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 파랑유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit3.p.x) < 15 && Math.abs(block.p.y - unit3.p.y) < 15 && b == true) {
			b = false;
			work.stop();
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 보라유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit4.p.x) < 15 && Math.abs(block.p.y - unit4.p.y) < 15 && b == true) {
			b = false;
			work.stop();
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 노란유령에게 잡혔다");
			System.exit(0);
		}
	}
	
	private void unitmove(Unit unit) {
			new Thread() {
				@Override
				public void run() {
					while(true) {
						if(!block.p.equals(unit.p)) {
						if (map[unit.p.y / 20][unit.p.x / 20 - 1] != 1) {
							if(block.p.x < unit.p.x && Math.abs(block.p.x - unit1.p.x) < 200){
									unit.p.x -= 20;
						}
					}else
						
						if (map[unit.p.y / 20][unit.p.x / 20 + 1] != 1) {
							if(block.p.x > unit.p.x && Math.abs(block.p.x - unit1.p.x) < 200){
								unit.p.x += 20;
						}
							}else
							
						if (map[unit.p.y / 20 - 1][unit.p.x / 20] != 1) {
								if(block.p.y < unit.p.y && Math.abs(block.p.y - unit1.p.y) < 200){
										unit.p.y -= 20;
							}
								}else
								
						if (map[unit.p.y / 20 + 1][unit.p.x / 20] != 1) {
								if(block.p.y > unit.p.y && Math.abs(block.p.y - unit1.p.y) < 200){
										unit.p.y += 20;
								}
						}
						}
						break;
					}
					
					while (true) {
						for (int i = 0; i < map.length; i++) {
							for (int j = 0; j < map[i].length;) {
						
								if(unit.p.x >= 960) {
									unit.p.x = 960;
								}else if(unit.p.x <= 20) {
									unit.p.x = 20;
								}else if(unit.p.y >= 742) {
									unit.p.y = 742;
								}else if(unit.p.y <= 20) {
									unit.p.y =20;
								}
								
									if (b == true) {
										where = 1 + (int) (Math.random() * 4);
									}
									switch(where) {
									case 1 :
										if (map[unit.p.y / 20][unit.p.x / 20 - 1] != 1) {
											unit.p.x -= 20;
										}
										break;
										
									case 2 :
										if (map[unit.p.y / 20][unit.p.x / 20 + 1] != 1) {
											unit.p.x += 20;
										}
										break;
										
									case 3 :
										if (map[unit.p.y / 20 - 1][unit.p.x / 20] != 1) {
											unit.p.y -= 20;
										}
										break;
										
									case 4 :
										if (map[unit.p.y / 20 + 1][unit.p.x / 20] != 1) {
											unit.p.y += 20;
										}
										break;
									}
									break;
								}
								
								where = 0;
								try {
									Thread.sleep(300);
									repaint();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
						}
					}
				}
			}.start();;
		}

	private void unitmove2(Unit unit) {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					for (int i = 0; i < map.length; i++) {
						for (int j = 0; j < map[i].length;) {
							if (b == true) {
								where = 1 + (int) (Math.random() * 4);
							}if(unit.p.x >= 960) {
								unit.p.x = 960;
							}else if(unit.p.x <= 20) {
								unit.p.x = 20;
							}else if(unit.p.y >= 742) {
								unit.p.y = 742;
							}else if(unit.p.y <= 20) {
								unit.p.y = 20;
							}
							
								switch(where) {
								case 1 :
									if (unit.p.x >= block.p.x) {
										unit.p.x -= 20;
									}
									break;
									
								case 2 :
									if (unit.p.x <= block.p.x) {
										unit.p.x += 20; 
									}
									break;
									
								case 3 :
									if (unit.p.y >= block.p.y) {
										unit.p.y -= 20;
									}
									break;
								case 4 :
									if (unit.p.y <= block.p.y) {
										unit.p.y += 20;
									}
									break;
								}
								break;
							}
							
							where = 0;
							try {
								Thread.sleep(500);
								repaint();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				}
			}
		}.start();;
	}
	
	public static void main(String[] args) {
		new Maze5();
	}
}
