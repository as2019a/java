package com.inc.painter.v1;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter extends JFrame{
	JPanel canvas;
	
	Point p1 = new Point(-10, -10);
	Point p2 = new Point(-10, -10);
	
	private Painter() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initEvent() {
		canvas.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				p1 = e.getPoint();
				canvas.repaint();
			}
			
		});
		add(canvas);
		
	}

	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.fillOval(p1.x, p1.y, 3, 3);
			}
		};
	}

	public static void main(String[] args) {
		new Painter();
	}

}
