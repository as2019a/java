package com.inc.event.v5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEventFrame extends JFrame {
	
	private JTextField field;
	
	private KeyEventFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		field = new JTextField(30);
		add(field);
		
		field.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					field.setText("");
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				//ESC를 연속으로 2번 눌렀을 때 프로그램을 종료하게 하시오
				int lastKey = e.getKeyCode();
				if(lastKey == KeyEvent.VK_ESCAPE && e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
				lastKey = e.getKeyCode();
			}
			
		});
	}

	public static void main(String[] args) {
		new KeyEventFrame();
	}

}