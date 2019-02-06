
package com.inc.jcomp.jbutton;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonFrame extends JFrame{
	JRadioButton rbtn1;
	JRadioButton rbtn2;
	JRadioButton rbtn3;
	JRadioButton rbtn4;
	JRadioButton rbtn5;
	JRadioButton rbtn6;
	
	private RadioButtonFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		rbtn1 = new JRadioButton("Male");
		rbtn2 = new JRadioButton("Female");
		//rbtn2.setSelected(true);
		
		//버튼그룹으로 두 개의 라디오 버튼을 그룹화
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rbtn1);
		btnGroup.add(rbtn2);
		
		add(rbtn1);
		add(rbtn2);
		
		rbtn1.setSelected(true);
		
		//초등학생, 중학생, 고등학생, 기타 총 4개의 라디오버튼 생성, 그룹화 및 추가
		rbtn3 = new JRadioButton("초등학생");
		rbtn4 = new JRadioButton("중학생");
		rbtn5 = new JRadioButton("고등학생");
		rbtn6 = new JRadioButton("기타");
		
		rbtn3.setSelected(true);
		
		ButtonGroup btnGroup1 =  new ButtonGroup(); //차후 레이아웃으로 그룹화;;
		btnGroup1.add(rbtn3);
		btnGroup1.add(rbtn4);
		btnGroup1.add(rbtn5);
		btnGroup1.add(rbtn6);
		
		add(rbtn3);
		add(rbtn4);
		add(rbtn5);
		add(rbtn6);
		
	}

	public static void main(String[] args) {
		new RadioButtonFrame();
	}
	}

	

