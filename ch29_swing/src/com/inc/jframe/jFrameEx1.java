package com.inc.jframe;

import javax.swing.JFrame;

public class jFrameEx1 extends JFrame {
	public jFrameEx1() {
		//타이틀 지정
		setTitle("JFrame 상속");
		
		//사이즈 조정
		//setSize(500, 1000);
		setBounds(300, 200, 100, 50);
		
		//화면에 보여주기
		setVisible(true);
		
		//x버튼을 눌렀을 때 수행될 옵션
		//1.프로그램을 종료
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//2.무시
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//3.화면에서 사라지게 하기(기본값)
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
