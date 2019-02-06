package com.inc.components;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class components1 extends JFrame{

	public static void main(String[] args) {
		//1. 사용자로 부터 12개중 1개의 버튼 클릭 
		System.out.println("해당 버튼을 클릭하세요");
		
		//2. 12개의 버튼 에서 1개의 버튼 클릭하면 클릭한 버튼에 해당하는 박스에서 메세지 생성(** 메뉴바도 추가(주석처리/보류) **) 
		// 메세지 생성 출력 후 프로그램 종료(반복)
		Frame frame = new Frame("New GridLayout");
		
		
		frame.setLayout(new GridLayout(4, 3));
		
	
		for(int i = 1; i <= 12; i++) {
			frame.add(new Button(String.valueOf(i)));
		} // 12개 버튼 박스 생성 **
		
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			
		//4. 12개 버튼 중 해당 버튼을 클릭하면 박스가 뜨면서 해당 메세지나 다음페이지로 넘어가는 기능 추가
		
		
		
		//5. 
		
			
		
	}

}
