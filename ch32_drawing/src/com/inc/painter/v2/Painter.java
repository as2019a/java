package com.inc.painter.v2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
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
		canvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
			   p2 = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
		});
		
		canvas.addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				p1 = p2;
				p2 = e.getPoint();
				canvas.repaint();
			}
			
		});
		add(canvas);
		
	}

	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				Graphics2D g2 = (Graphics2D)g;
				g2.setStroke(new BasicStroke(3));
				g.setColor(Color.BLUE);
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
		};
	}

	public static void main(String[] args) {
		new Painter();
	}

}
