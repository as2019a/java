package com.inc.event.v1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickEventFrame extends JFrame{
	private JButton btn;
	
	private ClickEventFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		//cardLayout = new CardLayout();
		setLayout(new FlowLayout());
		initComponent();
		//initEvent();
		setVisible(true);
	}
	

	private void initComponent() {
		btn = new JButton("Click me!");
		btn.addMouseListener(new MyMouseListener(this));
		add(btn);
		
	}


	public static void main(String[] args) {
		new ClickEventFrame();
	}

}
