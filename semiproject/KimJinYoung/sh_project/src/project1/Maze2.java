package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.html.MinimalHTMLWriter;

@SuppressWarnings("serial")
public class Maze2 extends JFrame {
	final ImageIcon wall = new ImageIcon("src/pacman/wall.png");
	List<Block> blockList = new ArrayList<>();
	List<Key> keyList = new ArrayList<>();
	List<Key2> key2List = new ArrayList<>();
	List<Key3> key3List = new ArrayList<>();
	Key key;
	Key2 key2;
	Key3 key3;
	Block block;
	JLabel timeLabel;
	JPanel canvas;
	Timer t;
	
	public long time;
	JFrame frame = new JFrame();
	
	private Maze2() {
		setTitle("Maze Runner");
		//setLayout(new GridLayout(14,14));
		setSize(705,510);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTimer();
		initComponent();
		initEvent();
		setVisible(true);
		
	}

	private void setTimer() {
	//	t = new Timer(0, null);
			
			
				Thread work = new Thread() {
					@Override
					public void run() {
						for(time = 60; time > 0; time--) {
							try {
								Thread.sleep(1000);
								canvas.repaint();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				};work.start();
				requestFocus();
			}



	private void initEvent() {
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					if ((int) block.p.x <= 24) {
						block.p.x = 24;
					}
					block.p.x -= 4;
					repaint();
					break;
				case KeyEvent.VK_RIGHT:
					if ((int) block.p.x >= 644) {
						block.p.x = 644;
					} else {
						block.p.x += 4;
					}
					repaint();
					break;

				case KeyEvent.VK_UP:
					if ((int) block.p.y <= 20) {
						block.p.y = 20;
					} else {
						block.p.y -= 4;
					}
					repaint();
					break;

				case KeyEvent.VK_DOWN:
					if ((int) block.p.y >= 423) {
						block.p.y = 423;
					} else {
						block.p.y += 4;
					}
					repaint();
					break;
					
				}
				
				if(block.p.y < 50 && block.p.y > 24 && block.p.x < 640) {
					block.p.y = 24;
				}else if(block.p.y >= 50 && block.p.y < 60 && block.p.x < 640) {
					block.p.y = 60;
				}else if(block.p.y >= 65 && block.p.y < 70 && block.p.x > 24) {
					block.p.y = 64;
				}else if(block.p.x > 24 && block.p.y >=70 && block.p.y < 100) {
					block.p.y = 100;
				}
				
				if(Math.abs( block.p.x - key.p.x) < 8 && Math.abs( block.p.y - key.p.y) < 8) {
					JOptionPane.showMessageDialog(getContentPane(), "승리");
					System.exit(0);
					
				}else if(Math.abs( block.p.x - key2.p.x) < 8 && Math.abs( block.p.y - key2.p.y) < 8) {
					if(key2List.isEmpty() == false) {
						key2List.remove(key2);
						JOptionPane.showMessageDialog(getContentPane(), "+ 10초");
						time += 10;
					}
				}else if(Math.abs( block.p.x - key3.p.x) < 8 && Math.abs( block.p.y - key3.p.y) < 8) {
					if(key3List.isEmpty() == false) {
						key3List.remove(key3);
						JOptionPane.showMessageDialog(getContentPane(), "+ 20초");
						time += 20;
					}
				}
			}
		});
	}

	private void initComponent() {
		
		String id1 = "user";
		String id2 = "key";
		String id3 = "key2";
		String id4 = "key3";
		
		block = new Block(id1, Color.black);
		key = new Key(id2, Color.white);
		key2 = new Key2(id3, Color.red);
		key3 = new Key3(id4, Color.blue);
		int x1 = 20;
		int y1 = 20;
		block.p = new Point(x1, y1);
		int x2 = (int) (Math.random() * 624 + 20);
		int y2 = (int) (Math.random() * 321 + 100);
		key.p = new Point(x2, y2);
		int x3 = (int) (Math.random() * 624 + 20);
		int y3 = (int) (Math.random() * 321 + 100);
		key2.p = new Point(x3, y3);
		int x4 = (int) (Math.random() * 624 + 20);
		int y4 = (int) (Math.random() * 321 + 100);
		key3.p = new Point(x4, y4);
		
		blockList.add(block);
		keyList.add(key);
		key2List.add(key2);
		key3List.add(key3);
		
		timeLabel = new JLabel("");
		add(timeLabel, BorderLayout.SOUTH);
		
		
		canvas = new JPanel() {

			public void paint(Graphics g) {
				super.paint(g);
				setBackground(Color.pink);
				
				for(int i=20; i<=660; i+=20) {
					g.drawImage(wall.getImage(), i,0,20,20, this);
				}
				
				for(int i=20; i<=620; i+=20) {
					g.drawImage(wall.getImage(), i,40,20,20, this);
				}
				
				for(int i=40; i<=640; i+=20) {
					g.drawImage(wall.getImage(), i,80,20,20, this);
				}
				
				for(int i=20; i<=660; i+=20) {
					g.drawImage(wall.getImage(), i,440,20,20, this);
				}
				
				for(int j = 0; j<=440; j+=20) {
					g.drawImage(wall.getImage(), 0,j,20,20, this);
				}
				
				for(int j = 20; j<=440; j+=20) {
					g.drawImage(wall.getImage(), 660,j,20,20, this);
				}
				
				for (Block block : blockList) {
					g.setColor(block.getC());
					g.fillRoundRect(block.p.x, block.p.y, 16, 16, 40, 40);
					//System.out.println(block.p);
				}
				
				for (Key key : keyList) {
					g.setColor(key.getC());
					g.fillRoundRect(key.p.x, key.p.y, 8, 8, 20, 20);
				}
				
				for (Key2 key2 : key2List) {
					g.setColor(key2.getC());
					g.fillRoundRect(key2.p.x, key2.p.y, 8, 8, 20, 20);
				}
				
				for (Key3 key3 : key3List) {
					g.setColor(key3.getC());
					g.fillRoundRect(key3.p.x, key3.p.y, 8, 8, 20, 20);
				}
				timeLabel.setText(time +"초");
				if(time <= 0) {
					JOptionPane.showMessageDialog(getContentPane(), "패배");
					System.exit(0);
				}
			};
		};
		
		frame.setSize(700, 500);
		frame.add(canvas);
		add(canvas);
		
	}

	public static void main(String[] args) {
		new Maze2();
	}
}
