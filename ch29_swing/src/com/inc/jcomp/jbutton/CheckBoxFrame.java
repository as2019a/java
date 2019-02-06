package com.inc.jcomp.jbutton;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxFrame extends JFrame{

	private CheckBoxFrame() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setResizable(false);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		JCheckBox cBox1 = new JCheckBox("영화", true);
		JCheckBox cBox2 = new JCheckBox("독서");
		//처음부터 체크되어있는지 여부
		cBox2.setSelected(true);
		JCheckBox cBox3 = new JCheckBox("게임");
		JCheckBox cBox4 = new JCheckBox("여행");
		cBox4.setEnabled(false);
		
		add(cBox1);
		add(cBox2);
		add(cBox3);
		add(cBox4);
		
		System.out.println(cBox1.isSelected());
		System.out.println(cBox4.isSelected());
		
		//여행가고싶은지역을 4개의 체크박스 생성, 추가
		JCheckBox cBox5 = new JCheckBox("대구 반월당");
		JCheckBox cBox6 = new JCheckBox("부산 서면");
		JCheckBox cBox7 = new JCheckBox("인천 서구 원당지구");
		JCheckBox cBox8 = new JCheckBox("경기도 부천시 중동");
		
		add(cBox5);
		add(cBox6);
		add(cBox7);
		add(cBox8);
		
		
	}

	public static void main(String[] args) {
		new CheckBoxFrame();
	}
	}

	

