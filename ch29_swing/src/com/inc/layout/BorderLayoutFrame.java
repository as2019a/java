package com.inc.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutFrame extends JFrame{
	
	private BorderLayoutFrame() {
	setTitle("Main frame");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300,300,500,500);
	//JFrame에 기본 레이아웃은 BorderLayout
	//setLayout(new GridLayout(3, 2));
	initComponent();
	setVisible(true);
	}
	
	private void initComponent() {
		add(new JButton("1"), BorderLayout.CENTER);
		add(new JButton("2"), BorderLayout.WEST);
		add(new JButton("3"), BorderLayout.EAST);
		add(new JButton("4"), BorderLayout.NORTH);
		add(new JButton("5"), BorderLayout.SOUTH);
		/*add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("10"));*/
		
	}

	public static void main(String[] args) {
		new BorderLayoutFrame();

	}

}
