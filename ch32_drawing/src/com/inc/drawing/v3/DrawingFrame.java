package com.inc.drawing.v3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingFrame extends JFrame {
	
	JPanel canvas;
	JPanel lineCanvas;
	
	int x;
	int y;
	
	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 0);

	private DrawingFrame() {
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
				
				x = e.getX();
				y = e.getY();
				canvas.repaint();
			}
		});
	
		lineCanvas.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				//클릭시 좌표를 p1.x, p1.y에 저장
				//p1.x = e.getX();
				//p1.y = e.getY();
				p1 = e.getPoint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				//클릭땔시 좌료를 p2.x, p2.y에 저장
				p2 = e.getPoint();
				lineCanvas.repaint();
			}
			
		});
	}
	
	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawString(x + " : " + y, x, y);
			}
		};
		canvas.setBackground(Color.WHITE);
		
		lineCanvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				//기존 그림을 지우고 새로그리기 
				super.paint(g);
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
			}
		};
		
		//add(canvas);
		add(lineCanvas);
	}

	public static void main(String[] args) {
		new DrawingFrame();
	}

}
