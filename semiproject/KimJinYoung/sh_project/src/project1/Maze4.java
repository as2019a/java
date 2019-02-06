package project1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Maze4 extends JFrame {
	int[][] map = {
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 0
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, // 1
			{ 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, // 2
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 }, // 3
			{ 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0 }, // 4
			{ 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0 }, // 5
			{ 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, // 6
			{ 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 }, // 7
			{ 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 }, // 8
			{ 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, // 9
			{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0 }, // 10
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0 }, // 11
			{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0 }, // 12
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0 }, // 13
			{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 0, 1, 0 }, // 14
			{ 0, 0, 0, 0, 1, 0, 2, 1, 0, 0, 1, 2, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 }, // 15
			{ 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 }, // 16
			{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 2, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0 }, // 17
			{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, // 18
			{ 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, // 19
			{ 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 20
			{ 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 21
			{ 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 22
			{ 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, // 23
			{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 }, // 24
			{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 25
			{ 1, 0, 1, 2, 2, 2, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 26
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 27
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 28
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, // 29
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 30
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 2, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 31
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 2 }, // 32
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 2, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1 }, // 33
			{ 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 2 }, // 34
			{ 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 2, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0 }, // 35
			{ 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 2, 1, 1, 1, 0, 1, 1, 0, 1, 2, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 36
			{ 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 2, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 2 }, // 37
			{ 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 }, // 38
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
	Key2 key2;
	Key2 key3;
	Key2 key4;
	Key2 key5;
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
	Thread work;

	private Maze4() {
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
		unitmove2(unit3);
		unitmove(unit4);

	}
	
	
	private void unitAct() {
		if(Math.abs(block.p.x - unit1.p.x) < 15 && Math.abs(block.p.y - unit1.p.y) < 15 && b == true) {
			b = false;
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 빨강유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit2.p.x) < 15 && Math.abs(block.p.y - unit2.p.y) < 15 && b == true) {
			b = false;
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 파랑유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit3.p.x) < 15 && Math.abs(block.p.y - unit3.p.y) < 15 && b == true) {
			b = false;
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 보라유령에게 잡혔다");
			System.exit(0);
		} else if (Math.abs(block.p.x - unit4.p.x) < 15 && Math.abs(block.p.y - unit4.p.y) < 15 && b == true) {
			b = false;
			JOptionPane.showMessageDialog(getContentPane(), "패배 : 노란유령에게 잡혔다");
			System.exit(0);
		}
	}
	
	private void setTimer() {
		work = new Thread() {
			@Override
			public void run() {
				for (time = 60; time > 0; time--) {
					try {
						Thread.sleep(1000);
						canvas.repaint();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		work.start();
		requestFocus();
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
					JOptionPane.showMessageDialog(getContentPane(), "승리\n" + time + "초");
					System.exit(0);

				} else if (Math.abs(block.p.x - key2.p.x) < 8 && Math.abs(block.p.y - key2.p.y) < 8) {
					if (key2List.contains(key2)) {
						time += 5;
						key2.p = new Point(-10, -10);
						JOptionPane.showMessageDialog(getContentPane(), "+ 5초");
					}
				} else if (Math.abs(block.p.x - key3.p.x) < 8 && Math.abs(block.p.y - key3.p.y) < 8) {
					if (key2List.contains(key3)) {
						time += 10;
						key3.p = new Point(-10, -10);
						JOptionPane.showMessageDialog(getContentPane(), "+ 10초");
					}
				}else if (Math.abs(block.p.x - key4.p.x) < 8 && Math.abs(block.p.y - key4.p.y) < 8) {
					if (key2List.contains(key4)) {
						time += 15;
						key4.p = new Point(-10, -10);
						JOptionPane.showMessageDialog(getContentPane(), "+ 15초");
					}
				}else if (Math.abs(block.p.x - key5.p.x) < 8 && Math.abs(block.p.y - key5.p.y) < 8) {
					if (key2List.contains(key5)) {
						time += 20;
						key5.p = new Point(-10, -10);
						JOptionPane.showMessageDialog(getContentPane(), "+ 20초");
					}
				}
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
		key2 = new Key2(keyId, Color.yellow);
		key3 = new Key2(keyId, Color.yellow);
		key4 = new Key2(keyId, Color.yellow);
		key5 = new Key2(keyId, Color.yellow);
		block.p = new Point(20, 20);
		unit1.p = new Point(480, 200);
		unit2.p = new Point(200, 100);
		unit3.p = new Point(280, 500);
		unit4.p = new Point(600, 580);

		while (true) {
			int x = (int) (Math.random() * map[0].length);
			int y = (int) (Math.random() * map.length);
			key.p = new Point(x * 20, y * 20);
			if (map[y][x] != 2) {
				continue;
			}
			break;
		}
		
		randomKey(key2);
		randomKey(key3);
		randomKey(key4);
		randomKey(key5);
		
		blockList.add(block);
		unitList.add(unit1);
		unitList.add(unit2);
		unitList.add(unit3);
		unitList.add(unit4);
		keyList.add(key);
		key2List.add(key2);
		key2List.add(key3);
		key2List.add(key4);
		key2List.add(key5);
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

				g.setColor(key2.getC());
				g.fillRoundRect(key2.p.x, key2.p.y, 12, 12, 50, 50);

				g.setColor(key3.getC());
				g.fillRoundRect(key3.p.x, key3.p.y, 12, 12, 50, 50);
				
				g.setColor(key4.getC());
				g.fillRoundRect(key4.p.x, key4.p.y, 12, 12, 50, 50);
				
				g.setColor(key5.getC());
				g.fillRoundRect(key5.p.x, key5.p.y, 12, 12, 50, 50);

				g.drawImage(unitIcon1.getImage(), unit1.p.x, unit1.p.y, 20, 20, this);
				g.drawImage(unitIcon2.getImage(), unit2.p.x, unit2.p.y, 20, 20, this);
				g.drawImage(unitIcon3.getImage(), unit3.p.x, unit3.p.y, 20, 20, this);
				g.drawImage(unitIcon4.getImage(), unit4.p.x, unit4.p.y, 20, 20, this);

				timeLabel.setText(time + "초");

				if (time <= 0 && b == true) {
					b = false;
					key.setC(Color.BLACK);
					JOptionPane.showMessageDialog(getContentPane(), "패배 : 타임아웃");
					System.exit(0);
				}
				unitAct();
			}
		};
		frame.add(canvas);
		add(canvas);
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


	private void unitmove(Unit unit) {
			new Thread() {
				@Override
				public void run() {
					while (true) {
						for (int i = 0; i < map.length; i++) {
							for (int j = 0; j < map[i].length; j++) {
								if (b == true) {
									where = 1 + (int) (Math.random() * 4);
								}
									if(unit.p.x >= 960) {
									unit.p.x = 960;
								}else if(unit.p.x <= 20) {
									unit.p.x = 20;
								}else if(unit.p.y >= 742) {
									unit.p.y = 742;
								}else if(unit.p.y <= 20) {
									unit.p.y =20;
								}
								
									switch(where) {
									case 1 :
										if (map[unit.p.y / 20][unit.p.x / 20 - 1] != 1) {
										
											/*for(int k = 0; k < 5; k++) {
												if (map[unit.p.y/20][unit.p.x/20 -k] >= map[block.p.y/20][block.p.x/20]) {
													}
											}*/
											unit.p.x -= 20;
										}else {
											where += 3;
										}
										break;
										
									case 2 :
										if (map[unit.p.y / 20][unit.p.x / 20 + 1] != 1) {
											
											/*for(int k = 0; k < 5; k++) {
											if (map[unit.p.y/20][unit.p.x/20 +k] <= map[block.p.y/20][block.p.x/20]) {
											}
											}*/
											unit.p.x += 20; 
										}else {
											where --;
										}
										break;
										
									case 3 :
										
										if (map[unit.p.y / 20 - 1][unit.p.x / 20] != 1) {
											unit.p.y -= 20;
										}else {
											where--;
										}
										break;
									case 4 :
										if (map[unit.p.y / 20 + 1][unit.p.x / 20] != 1) {
											unit.p.y += 20;
										}else {
											where--;
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

	
	private void unitmove2(Unit unit) {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					for (int i = 0; i < map.length; i++) {
						for (int j = 0; j < map[i].length; j++) {
							if (b == true) {
								where = 1 + (int) (Math.random() * 4);
							}if(unit.p.x >= 960) {
								unit.p.x = 960;
							}else if(unit.p.x <= 20) {
								unit.p.x = 20;
							}else if(unit.p.y >= 742) {
								unit.p.y = 742;
							}else if(unit.p.y <= 20) {
								unit.p.y =20;
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
		new Maze4();
	}
}
