package com.inc.assignment;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Click extends JFrame{
	
	JPanel canvas;
	JLabel scoreLabel;
	JLabel timeLabel;
	JPanel northPanel;
	
	Point p = new Point();
	int score = 0;
	int time = 10;
	boolean isGaming = true;
	
	private Click() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 400, 500);
		initComponent();
		initEvent();
		setVisible(true);
		
		new Thread(){
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
					time--;
					timeLabel.setText(time + "초");
				}
				isGaming = false;
			}
		}.start();
	}
	
	private void initEvent() {
		canvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if(isGaming == false) {
					return;
				}
				//조건 
				//p.x, p.y와 e.getX(), e.getY() 두점간의 간격이
				//15보다 작은지
				int dx = p.x + 15 - e.getX();
				int dy = p.y + 15 - e.getY();
				double d = Math.pow(dx, 2) + Math.pow(dy,2);
				d = Math.sqrt(d);
				if(d <= 15) {
					scoreLabel.setText(++score + "점");
				}
				p.x = (int)(Math.random() * 371);
				p.y = (int)(Math.random() * 471);
				canvas.paint(canvas.getGraphics());
				
			}
			
		});
	}

	private void initComponent() {
		p.x = (int)(Math.random() * 371);
		p.y = (int)(Math.random() * 471);
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.clearRect(0, 0, canvas.getWidth(),canvas.getHeight());
				g.fillOval(p.x, p.y, 30, 30);
			}
		};
		add(canvas);
		
		scoreLabel = new JLabel(score + "점");
		scoreLabel.setHorizontalAlignment(JLabel.CENTER);
		timeLabel = new JLabel(time + "초");
		timeLabel.setHorizontalAlignment(JLabel.CENTER);
		northPanel = new JPanel(new GridLayout(1, 2));
		northPanel.add(scoreLabel);
		northPanel.add(timeLabel);
		add(northPanel, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new Click();
	}

}
