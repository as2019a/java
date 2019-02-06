package com.inc.down.v3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Down extends JFrame{
	
	JPanel canvas;
	JLabel scoreLabal;
	
	Point p = new Point();
	int speedx = 1;
	int speedy = 1;
	int score = 0;
	
	Timer t;
	
	private Down() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		setVisible(true);
		
		/*new Thread() {

			@Override
			public void run() {
				while(true) {
					p.y += speedy;
					canvas.getGraphics().clearRect(
							0, 0, canvas.getWidth(), canvas.getHeight());
					canvas.print(canvas.getGraphics());
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
			
		}.start();*/
		t = new Timer(5, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.y += speedy;
				canvas.getGraphics().clearRect(
						0, 0, canvas.getWidth(), canvas.getHeight());
				canvas.print(canvas.getGraphics());
			}
		});
		t.start();
	}
	
	private void initEvent() {
		
		
	}

	private void initComponent() {
		p.x = (int)(Math.random() * 350);
		canvas = new JPanel() {
			@Override
			public void print(Graphics g) {
				g.fillOval(p.x, p.y, 15, 15);
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
