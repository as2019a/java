package com.inc.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {

	List<Jelly> jellyList = new ArrayList<>();
	List<Xjelly> jellyList2 = new ArrayList<>();

	JButton start = new JButton("s");
	JButton next = new JButton("n");

	ImageIcon startBtn = new ImageIcon("src/com/inc/images/startBtn.png");
	ImageIcon startP = new ImageIcon("src/com/inc/images/startP.png");
	ImageIcon pauseBtn = new ImageIcon("src/com/inc/images/pauseBtn.png");
	ImageIcon pauseP = new ImageIcon("src/com/inc/images/pauseP.png");
	ImageIcon restartBtn = new ImageIcon("src/com/inc/images/restartBtn.png");
	ImageIcon restartP = new ImageIcon("src/com/inc/images/backP.png"); 
	
	ImageIcon nextB = new ImageIcon("src/com/inc/images/n.png");
	ImageIcon nextB2 = new ImageIcon("src/com/inc/images/n2.png");
	
	ImageIcon homeBtn = new ImageIcon("src/com/inc/images/homeBtn.png");
	ImageIcon homeP = new ImageIcon("src/com/inc/images/homeP.png");

	Image gamebkg = new ImageIcon("src/com/inc/images/gamebkg_1.jpg").getImage();
	Image basket = new ImageIcon("src/com/inc/images/basket.png").getImage();
	Image gameWin = new ImageIcon("src/com/inc/images/gameWin.jpg").getImage();
	Image gameLose = new ImageIcon("src/com/inc/images/gameLose.jpg").getImage();
	JLabel center = new JLabel();
	Image exbkg; // 임시배경

	int x_basket, y_basket;
	JLabel time = new JLabel();
	JLabel points = new JLabel();
	JLabel nextBtn = new JLabel();

	int pointsCount = 0; // 젤리 포인트
	int time30 = 30; // 1분 정도
	int counter = 0;
	boolean gameOver = false;
	boolean isGaming = false;
	Timer downTimer;
	Timer makeTimer;
	Timer checkTimer;

	GamePanel() {
		//start 버튼
		start.setIcon(startBtn);
		start.setBounds(965, 10, 80, 80);
		start.setBorderPainted(false); // 임시
		start.setContentAreaFilled(false);
		start.setFocusPainted(false);
		setFocusable(true);

		add(start);

		//next 버튼
		next.setIcon(nextB);
		next.setBounds(370, 550, 300, 80);
		next.setBorderPainted(false);
		next.setContentAreaFilled(false);
		next.setFocusPainted(false);
		setFocusable(true);
		next.hide();
		
		add(next);
		
		initTimer();
		setLayout(null);
		setFocusable(true);
		x_basket = 450;
		y_basket = 500;


		//타임, 포인트 좌표
		time = new JLabel("TIME  ▶▶▶  "+ 30);
		time.setBounds(90, 45, 100, 20); // 타임 라벨 스크린
		points = new JLabel("POINTS : 0");
		points.setBounds(250, 45, 100, 20);
		exbkg = gamebkg;

		add(time);
		add(points);
		
		next.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseExited(MouseEvent e) {
				if(next.getText().equals("n")) {
					next.setIcon(nextB);
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if(next.getText().equals("n")) {
					next.setIcon(nextB2);
				}
			}
			
		});

		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				if(start.getText().equals("s")) {
					start.setIcon(startBtn);
				}else if(start.getText().equals("p")) {
					start.setIcon(pauseBtn);
				}else if(start.getText().equals("r")) {
					start.setIcon(restartBtn);
				}else {
					start.setIcon(homeBtn);
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(start.getText().equals("s")) {
					start.setIcon(startP);
				}else if(start.getText().equals("p")) {
					start.setIcon(pauseP);
				}else if(start.getText().equals("r")) {
					start.setIcon(restartP);
				}else {
					start.setIcon(homeP);
				}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if (start.getText().equals("s")) {
					repaint();
					isGaming = true;
					start.setIcon(pauseBtn);
					start.setText("p");
					downTimer.start();
					makeTimer.start();
					checkTimer.start();
				} else if (start.getText().equals("p")) {
					isGaming = false;
					start.setIcon(restartBtn);
					start.setText("r");
					downTimer.stop();
					makeTimer.stop();
					checkTimer.stop();
				} else if (start.getText().equals("r")) {
					isGaming = true;
					start.setIcon(pauseBtn);
					start.setText("p");
					downTimer.restart();
					makeTimer.restart();
					checkTimer.restart();
				}else {
					gameOver = false;
					Game.cardlayout.show(Game.cards, "MenuPanel");
					exbkg = gamebkg;
					next.hide();
					basket = new ImageIcon("src/com/inc/images/basket.png").getImage();
					start.setIcon(startBtn);
					start.setText("s");
					points.setText("POINTS : " + 0);
					time.setText("TIME  ▶▶▶ "+ 30);
					time30 = 30;
					pointsCount = 0;
					x_basket = 450;
					y_basket = 500;
					
					repaint();
					
				}
				requestFocus();
			}
		});

		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == ke.VK_LEFT) {
					if(x_basket < -5) {
						x_basket += 30;
					}
					x_basket -= 30;
					repaint();
				}

				if (ke.getKeyCode() == ke.VK_RIGHT) {
					if(x_basket > 950) {
						x_basket -= 30;
					}
					x_basket += 30;
					repaint();
				}
			}
		});

	}

	private void initTimer() {
		downTimer = new Timer(30, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fallJelly();
				fallXjelly();
				checkGameOver();
				repaint();
			}
		});

		makeTimer = new Timer(2000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jellyList.add(new Jelly());
				jellyList2.add(new Xjelly());

			}
		});

		checkTimer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				time.setText("TIME  ▶▶▶ "+ time30--);
				if(time30 == 0) {
					checkGameOver();
				}
			}
		});
	}

	void fallJelly() { //일반 젤리
		Rectangle basketRect = new Rectangle(x_basket, y_basket, 60, 20);

		for (int i = 0; i < jellyList.size(); i++) {
			Jelly j = jellyList.get(i);
			j.p.y += 5;

			if (j.p.y > 600) {
				jellyList.remove(j);
			}
			if (basketRect.intersects(new Rectangle(j.p.x, j.p.y, 45, 50))) {
				pointsCount += 1;
				points.setText("POINTS : " + pointsCount);
				jellyList.remove(j);
			}
		}
	}

	void fallXjelly() { //-젤리
		Rectangle basketRect = new Rectangle(x_basket, y_basket, 60, 20);

		for (int i = 0; i < jellyList2.size(); i++) {
			Xjelly j = jellyList2.get(i);
			j.p.y += 5;

			if (j.p.y > 600) {
				jellyList2.remove(j);
			}
			if (basketRect.intersects(new Rectangle(j.p.x, j.p.y, 45, 50))) {
				pointsCount -= 5;
				points.setText("POINTS : " + pointsCount);
				jellyList2.remove(j);
			}
		}
	}


	void checkGameOver() {
		if (time30 == -1) {
			isGaming = false;
			//JLabel yourScore = new JLabel("YOU SCORE :" + pointsCount);
			gameOver = true;
			start.setIcon(homeBtn);
			start.setBounds(955, 10, 80, 80);
			start.setText("");
			downTimer.stop();
			makeTimer.stop();
			checkTimer.stop();
			jellyList.removeAll(jellyList);
			jellyList2.removeAll(jellyList2);

			basket = new ImageIcon("").getImage();
			
			if(pointsCount > 11) {
				JOptionPane.showMessageDialog(getRootPane(),
						"     TIME OUT!           [" +pointsCount + " POINT]");
				exbkg = gameWin;
				next.show();
			}else if(pointsCount == 0 || pointsCount < 20){
				JOptionPane.showMessageDialog(getRootPane(),
						"     TIME OUT!           [" +pointsCount + " POINT]");
				exbkg = gameLose;
				//next.show();
			}
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g); // super
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(exbkg, 0, 0, null);

		for (Jelly j : jellyList) {
			g2d.drawImage(j.getImage(), j.p.x, j.p.y, null);
		}
		for (Xjelly j : jellyList2) {
			g2d.drawImage(j.getImage(), j.p.x, j.p.y, null);
		}
		g2d.drawImage(basket, x_basket, y_basket, null);
	}
}
