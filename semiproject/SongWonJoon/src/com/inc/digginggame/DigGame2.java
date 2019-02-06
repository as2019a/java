package com.inc.digginggame;

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
import javax.swing.JPanel;
import javax.swing.Timer;

public class DigGame2 extends JFrame {
	private JPanel playPanel;
	private ImageIcon playChar;
	private ImageIcon helthPoint;
	private ImageIcon item1;
	private ImageIcon box;
	private ImageIcon boxTrap;
	private ImageIcon basicTrap;
	private int backGroundy = 50;
	int distance = 0;
	int distanceCount = 50;
	Point charPoint = new Point(200,0);
	List<Point> traceList = new ArrayList<>();
	
	boolean isPressing;
	private Timer tm1;
	private Thread t1;
	
	public DigGame2() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 100, 500, 550);
		setResizable(false);
		initComponent();
		initEvent();
		initTread();
		setVisible(true);
	}
	

	private void initTread() {
		
	}


	private void initEvent() {
		traceList.add(charPoint);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(isPressing) {
					return;
				}
				isPressing = true;
				tm1 = new Timer(50, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e2) {
						if(e.getKeyCode() == KeyEvent.VK_LEFT) {
							charPoint.x -= 50;
							traceList.add(charPoint);
						}
						if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
							charPoint.x += 50;
							traceList.add(charPoint);
						}
						if(e.getKeyCode() == KeyEvent.VK_DOWN) {
							charPoint.y += 50;
							traceList.add(charPoint);
							distance += 50;
							distanceCount += 50;
							if(charPoint.y == 500) {
								charPoint.y = 0;
								backGroundy = 0;
							}
							
						}
						repaint();
					}
				});
				tm1.start();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				tm1.stop();
				isPressing = false;
			}
		});
	}

	private void initComponent() {
		playChar = new ImageIcon("C:/increpas/java/example/ch31_image/src/com/inc/images/man.png");
		playPanel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				//배경
				g.setColor(Color.BLACK);
				g.fillRect(0, backGroundy, 500, 550);
				//플레이어 trace
				g.setColor(Color.WHITE);
				for(Point charPoint : traceList) {
					g.fill3DRect(charPoint.x,charPoint.y, 50, 50, false);
					if(charPoint.y == 500) {
						traceList.removeAll(traceList);
					}
				}
				//거리표시기
				g.drawLine(0, distanceCount, 500, distanceCount);
				//g.setColor(Color.RED);
				//g.drawString(distance+"M", 400, distanceCount-10);
				if(distanceCount == 500) {
					distanceCount = 0;
				}
				//플레이어
				g.drawImage(playChar.getImage(),charPoint.x,charPoint.y, this);
			}
		};
		add(playPanel);
	}

	public static void main(String[] args) {
		new DigGame2();
	}
}
