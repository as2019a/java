package com.inc.jframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class jFrameTest {

	public static void main(String[] args) {
		//1.JFrame을 상속한 뒤 필요한 로직을 생성자에서 작성
		//new jFrameEx1();
		//new jFrameEx2();
		
		//2.JFrame인스턴스 생성 후 메서드에서 로직 생성
		JFrame frame = new JFrame();
		frame.setTitle("JFrame 인스턴스 생성");
		frame.setBounds(100, 100, 100, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new JLabel("Hello"));
		
		
		
	}

}
