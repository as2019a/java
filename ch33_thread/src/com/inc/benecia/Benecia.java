package com.inc.benecia;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;

public class Benecia extends JFrame{
	
	List<Word> words = new Vector<>();
	String[] cities = 
		{"서울", "인천", "경기도", "멘휀", "바티칸", "로마", "리우", "이스탄불"};
	
	JPanel canvas;
	JTextField answerField;
	
	Timer t;
	
	private Benecia() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		initComponent();
		initEvent();
		initTimer();
		setVisible(true);
		while(true) {
			int r = (int)(Math.random() * cities.length);
			Word word = new Word(cities[r]);
			word.p.x = (int)(Math.random() * 450);
			words.add(word);
			try {
				Thread.sleep(2000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}

	private void initTimer() {
		t = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for(Iterator<Word> i = words.iterator(); i.hasNext();) {
					Word word = i.next();
					word.p.y += 20;
					if(word.p.y > 450) {
						i.remove();
						t.stop();
					}
				}
				canvas.repaint();
			}
		});
		t.start();
	}

	private void initEvent() {
		answerField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					for(Iterator<Word> i = words.iterator(); i.hasNext();) {
						Word word = i.next();
						if(answerField.getText().equals(word.getAnswer())) {
							i.remove();
							canvas.repaint();
							break;
						}
					}
					answerField.setText("");
				}
			}
			
		});
	}

	private void initComponent() {
		canvas = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				synchronized (words) {
					for(Word word : words) {
						g.drawString(word.getAnswer(), word.p.x, word.p.y);
					}
				}
			}
		};
		add(canvas);
		answerField = new JTextField(10);
		add(answerField, BorderLayout.SOUTH);
	}

	public static void main(String[] args)	 {
		new Benecia();
	}

}
