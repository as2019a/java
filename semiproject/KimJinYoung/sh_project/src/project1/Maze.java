package project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Maze extends JFrame {
	
	final ImageIcon wall = new ImageIcon("src/pacman/wall.png");
	List<Block> blockList = new ArrayList<>();
	List<Key> keyList = new ArrayList<>();
	Key key;
	Block block;
	JPanel canvas;
	
	Timer t;
	JFrame frame = new JFrame();

	
	
	private Maze() {
		setTitle("Maze Runner");
		//setLayout(new GridLayout(14,14));
		setSize(705,510);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponent();
		initEvent();
		setVisible(true);
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
					block.p.x -= 3;
					repaint();
					break;
				case KeyEvent.VK_RIGHT:
					if ((int) block.p.x >= 648) {
						block.p.x = 648;
					} else {
						block.p.x += 3;
					}
					repaint();
					break;

				case KeyEvent.VK_UP:
					if ((int) block.p.y <= 20) {
						block.p.y = 20;
					} else {
						block.p.y -= 3;
					}
					repaint();
					break;

				case KeyEvent.VK_DOWN:
					if ((int) block.p.y >= 427) {
						block.p.y = 427;
					} else {
						block.p.y += 3;
					}
					repaint();
					break;

				}
				
				if(Math.abs( block.p.x - key.p.x) < 4 && Math.abs( block.p.y - key.p.y) < 4) {
					JOptionPane.showMessageDialog(getContentPane(), "승리");
					System.exit(0);
				}
			}
		});
	}

	private void initComponent() {
		String id1 = "user";
		String id2 = "key";
		
		block = new Block(id1, Color.black);
		key = new Key(id2, Color.green);
		int x1 = (int) (Math.random() * 450);
		int y1 = (int) (Math.random() * 420);
		block.p = new Point(x1, y1);
		int x2 = (int) (Math.random() * 100 + 400);
		int y2 = (int) (Math.random() * 150 + 300);
		key.p = new Point(x2, y2);
		blockList.add(block);
		keyList.add(key);
		canvas = new JPanel() {

			public void paint(Graphics g) {
				super.paint(g);
				for(int i=20; i<=660; i+=20) {
					//for(int j=20; j<=440; j+=20) {
						g.drawImage(wall.getImage(), i,0,20,20, this);
				}
			//}
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
					g.fillRoundRect(block.p.x, block.p.y, 12, 12, 40, 40);
					//System.out.println(block.p);
				}
				for (Key key : keyList) {
					g.setColor(key.getC());
					g.fillRoundRect(key.p.x, key.p.y, 8, 8, 20, 20);
				}
			};
		};
		
		frame.setSize(700, 500);
		frame.add(canvas);
		
		add(canvas);
	}

	public static void main(String[] args) {
		new Maze();
	}
}
