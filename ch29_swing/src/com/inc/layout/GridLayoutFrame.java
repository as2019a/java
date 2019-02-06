package com.inc.layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutFrame extends JFrame{
	
	private GridLayoutFrame() {
	setTitle("Main frame");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300,300,500,500);
	//setLayout(new GridLayout(3, 2));
	setLayout(new GridLayout(3, 2, 10, 19));
	//initMenu();
	initComponent();
	setVisible(true);
	}
	
	private void initComponent() {
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("10"));
		
	}

	public static void main(String[] args) {
		new GridLayoutFrame();

	}

}
