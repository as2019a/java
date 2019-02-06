package com.inc.jcomp.jbutton;

import java.awt.FlowLayout;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxFrame extends JFrame {
	JComboBox<String> fruitBox;
	JComboBox<Integer> scoreBox;
	JComboBox<String> monthBox;
	
	private ComboBoxFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	

	private void initComponent() {
		String[] fruits = {"Apple", "Banana", "CoConut"};
		fruitBox = new JComboBox<>(fruits);
		fruitBox.addItem("Durian");
		fruitBox.removeItemAt(3);
		add(fruitBox);
		
		Vector<Integer> scores = new Vector<>();
		for(int score = 100; score > 0; score-=10) {
			scores.add(score);
		}
		scoreBox = new JComboBox(scores);
		
		add(scoreBox);
		
		//monthBox에 1월~12월 까지 추가하시오
		String[] months = new String[12];
		for(int month = 12; month < 13; month++) {
			months[month - 1] = month + "월";
		}
		monthBox = new JComboBox<>(months);
		add(monthBox);
	}



	public static void main(String[] args) {
		new ComboBoxFrame();
	}

}
