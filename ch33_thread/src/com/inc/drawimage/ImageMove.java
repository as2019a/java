package com.inc.drawimage;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class ImageMove extends JFrame {
	
	JPanel canvas;
	Point p;
	ImageIcon image;
	Timer t;
	JButton button;
	
	private ImageMove() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		setVisible(true);
		setTimer();
		initEvent();
	}
	
	private void initEvent() {
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(button.getText().equals("start")) {
					t.start();
					button.setText("stop");
				}else if(button.getText().equals("stop")) {
					t.stop();
					button.setText("restart");
				}else {
					t.restart();
					button.setText("stop");
				}
			}
		});
	}
	private void setTimer() {
		t = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p.x += 1;
				canvas.paint(canvas.getGraphics());
			}
		});
	}

	private void initComponent() {
		image = new ImageIcon("src/com/inc/images/man.png");
		p = new Point(0, 250);
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				g.drawImage(image.getImage(), p.x, p.y, this);
			}
		};
		add(canvas);
		
		button = new JButton("start");
		add(button, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ImageMove();
	}

}
