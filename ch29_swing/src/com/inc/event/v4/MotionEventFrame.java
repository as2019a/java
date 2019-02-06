package com.inc.event.v4;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MotionEventFrame extends JFrame {
	
	private JPanel panel;
	
	private MotionEventFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 255, 255);
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		panel = new JPanel();
		panel.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println(e.getX()+":"+e.getY());
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				panel.setBackground(
						new Color(e.getX(), e.getY(), 255));
			}
		});
		panel.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				if(e.isControlDown()) {
					System.out.println("휠 내림");
				}
			}
		});
		
		add(panel);
	}

	public static void main(String[] args) {
		new MotionEventFrame();
	}

}

