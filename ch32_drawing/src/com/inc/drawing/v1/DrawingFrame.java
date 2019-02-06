package com.inc.drawing.v1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingFrame extends JFrame {
	
	JPanel canvas;
	
	private DrawingFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		canvas = new JPanel() {

			@Override
			public void paint(Graphics g) {
				//Graphics == 붓
				g.drawRect(50, 50, 100, 200);
				g.drawRect(150, 50, 200, 100);
				g.setColor(Color.RED);
				g.fillRect(150, 150, 100, 200);
				
				g.setFont(Font.getFont("맑은고딕"));
				g.setColor(Color.GRAY);
				g.drawString("연습만이 살길이다", 180, 100);
				
				g.fill3DRect(200, 150, 50, 50, true);

			}

			
			
		};
		canvas.setBackground(Color.WHITE);
		add(canvas);
		
	}

	public static void main(String[] args) {
		new DrawingFrame();

	}

}
