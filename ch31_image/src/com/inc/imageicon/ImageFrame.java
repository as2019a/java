package com.inc.imageicon;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ImageFrame extends JFrame{
	
	private ImageIcon bigImg;
	private ImageIcon btnImg;
	private JLabel centerLabel;
	private JButton searchBtn;
	
	
	private ImageFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		bigImg = new ImageIcon("src/com/inc/images/sky.jpg");
		btnImg = new ImageIcon("src/com/inc/images/btn.jpg");
		
		centerLabel = new JLabel();
		centerLabel.setIcon(bigImg);
		
		searchBtn = new JButton(btnImg);
		searchBtn.setPreferredSize(new Dimension(229, 220));
		
		add(centerLabel);
		add(searchBtn, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ImageFrame();
	}

}
