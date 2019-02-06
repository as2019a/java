package com.inc.jcomp.jbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.Buffer;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame {

	private ButtonFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		//사이즈 고정
		setResizable(false);
		JButton btn1 = new JButton();
		btn1.setText("open");
		//버튼 이벤트 부여
		btn1.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				if("open".equals(btn1.getText())) {
					btn1.setText("close");
				}else {
					btn1.setText("open");
				}
			}
		});
		add(btn1);
		
		//레이아웃 변경
		setLayout(new FlowLayout());
		setVisible(true);
		
		JButton btn2 = new JButton("LEE YOUNG SEOP");
		add(btn2);
		
		add(new JButton("Halls"));
		
	     //버튼사이즈
		//btn2.setSize(100,50); //사이즈 변경 실패
		btn2.setPreferredSize(new Dimension(100, 50));
		//색지정
		//글씨색
		btn2.setForeground(new Color(100, 0, 0));
		//배경색
		btn2.setBackground(Color.LIGHT_GRAY);
		
		//50*100사이즈의 버튼 생성
		//버튼의 이름은 INCREPAS
		//버튼의 글씨색은 PINK
		//버튼의 배경색은 GRAY
		//frame에 추가
		
		//btn4.setText("INCREPAS");
		JButton inc = new JButton("INCREPAS");
		inc.setForeground(Color.PINK);
		inc.setBackground(Color.GRAY);
		add(inc);
		
		
	}
	
	
	public static void main(String[] args) {
		new ButtonFrame();
	}

}
