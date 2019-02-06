package com.inc.down.v2;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Down extends JFrame{
	
	JPanel canvas;
	JLabel scoreLabal;
	
	Point p = new Point();
	int speedx = 1;
	int speedy = 1;
	int score = 0;
	
	private Down() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		setVisible(true);
		
		new Thread() {

			@Override
			public void run() {
				while(true) {
					if(p.y > 450 || p.y < 0) {
						speedy = -speedy;
					}
					if(p.x > 360 || p.x < 0) {
						speedx = -speedx;
					}
					
					p.x += speedx;
					p.y += speedy;
					canvas.getGraphics().clearRect(
							0, 0, canvas.getWidth(), canvas.getHeight());
					canvas.print(canvas.getGraphics());
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();;
	}
	
	private void initEvent() {
		canvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				//조건
				//p.x, p.y와 e.getx(), e.gety() 두점간의 간격이 15보다 작은지
				int dx = p.x + 15 - e.getX(); 
				int dy = p.y + 15 - e.getY(); 
				double d = Math.pow(dx, 2) + Math.pow(dy, 2);
				if(d <= 15) {
					scoreLabal.setText(++score + "점");
				}
			}
			
		});
		
	}

	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void print(Graphics g) {
				g.fillOval(p.x, p.y, 30, 30);
			}
		};
		add(canvas);
		
		scoreLabal = new JLabel(score + "점");
		add(scoreLabal, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new Down();
	}

}
