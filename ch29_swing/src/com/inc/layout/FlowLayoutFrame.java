package com.inc.layout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutFrame extends JFrame{
	
	private FlowLayoutFrame() {
	setTitle("Main frame");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300,300,500,500);
	setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
	//initMenu();
	initComponent();
	setVisible(true);
	}
	
	private void initComponent() {
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		add(new JLabel("apple"));
		add(new JLabel("Banana"));
		add(new JLabel("Coconut"));
		
	}

	public static void main(String[] args) {
		new FlowLayoutFrame();

	}

}
