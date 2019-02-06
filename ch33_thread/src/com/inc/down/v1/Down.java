package com.inc.down.v1;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Down extends JFrame{
	
	JPanel canvas;
	Point p = new Point();
	
	private Down() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		setVisible(true);
		
		while(true) {
			if(p.y > 400) {
				break;
			}
			p.y += 1;
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
	
	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void print(Graphics g) {
				g.fillOval(250, p.y, 30, 30);
			}
		};
		add(canvas);
	}

	public static void main(String[] args) {
		new Down();
	}

}
