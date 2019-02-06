package com.inc.event.v3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickEventFrame extends JFrame {

	private JButton btn;
	private JButton btn2;
	
	private ClickEventFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}

	private void initComponent() {
		btn = new JButton("Click me!");
		//익명 내부클래스
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				getContentPane().setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				getContentPane().setBackground(Color.BLUE);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				getContentPane().setBackground(Color.PINK);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				getContentPane().setBackground(Color.GREEN);
			}
			 
		});
		
		btn2 = new JButton("버튼");
		//버튼을 눌렀다 땟을때 버튼의 글씨를 Button으로 변경
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				btn2.setText("Button");
			}
		});
		
		add(btn);
		add(btn2);
	}

	public static void main(String[] args) {
		new ClickEventFrame();
	}

}
