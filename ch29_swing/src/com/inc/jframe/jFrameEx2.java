package com.inc.jframe;

import javax.swing.JFrame;

public class jFrameEx2 extends JFrame {
	//jFrameEx2 "2002"
	
	public jFrameEx2() {
		setTitle("2002");
		setSize(800, 800);
		setBounds(300, 200, 300, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
