package com.inc.drawing.v2;

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
				//원
				g.drawOval(200, 200, 100, 100);
				g.fillOval(202, 202, 96, 96);
				
				//다각형
				g.drawPolygon(new int[] {100, 200, 200, 100}, new int[] {100, 200, 100, 200}, 4);
				
				//선
				g.drawLine(10, 10, 100, 200);
				

			}

			
			
		};
		canvas.setBackground(Color.WHITE);
		add(canvas);
		
	}

	public static void main(String[] args) {
		new DrawingFrame();

	}

}
