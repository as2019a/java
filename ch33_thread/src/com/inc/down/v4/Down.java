package com.inc.down.v4;

import java.awt.BorderLayout;
import java.awt.Graphics;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Down extends JFrame{
	
	JPanel canvas;
	JLabel scoreLabel;
	ImageIcon manImage;
	Point manPoint = new Point(200, 390);
	
	boolean isGaming;
	
	JButton button;
	
	int speedy = 3;
	int speedx = 1;
	long startTime = 0;
	long stopTime;
	long minusTime;
	Timer t;
	List<Point> points = new Vector<>();
	
	
	private Down() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 400, 500);
		initComponent(); 
		initEvent();
		setVisible(true);
		setTimer();
		//다시 frame으로 포커싱
		requestFocus();
		while(true) {
			if(isGaming) {
				int x = (int)(Math.random()*350);
				points.add(new Point(x, 0));
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
		}
	}
	
	private void setTimer() {
		t = new Timer(5, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				synchronized(points) {
					for(Iterator<Point> i = points.iterator();i.hasNext();) {
						Point p = i.next();
						p.y += speedy;
						if(p.y > 425) {
							i.remove();
						}
					}
				}
				canvas.repaint();
			}
		});
	}
	
	private void initEvent() {
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					manPoint.x += 20;
				}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					manPoint.x -= 20;
				}
			}
			
		});
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(button.getText().equals("start")) {
					isGaming = true;
					startTime = System.currentTimeMillis();
					t.start();
					button.setText("stop");
				}else if(button.getText().equals("stop")) {
					stopTime = System.currentTimeMillis();
					isGaming = false;
					t.stop();
					button.setText("restart");
				}else {
					minusTime += System.currentTimeMillis() - stopTime;
					isGaming = true;
					t.restart();
					button.setText("stop");
				}
				requestFocus();
			}
		});
	}

	private void initComponent() {
		manImage = new ImageIcon("src/com/inc/images/man.png");
		
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				g.drawImage(manImage.getImage(),
						manPoint.x-25,manPoint.y-25, this);
				synchronized (points) {
					for(Point p : points) {
						g.fillOval(p.x, p.y, 15, 15);
					}
				}
				scoreLabel.setText(
(System.currentTimeMillis() - startTime - minusTime)/1000.0  +"초");
			}
		};
		add(canvas);
		
		scoreLabel = new JLabel("0초");
		add(scoreLabel, BorderLayout.NORTH);
		
		button = new JButton("start");
		add(button, BorderLayout.SOUTH);
		
	}

	public static void main(String[] args) {
		new Down();
	}

}
