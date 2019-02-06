package com.inc.digginggame.v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	private JPanel mainPanel, playPanel, statusPanel;
	private JButton[][] buttons;
	private JButton gameToHomeBtn;
	private JLabel lifeLabel, timeLabel, distanceLabel;
	private int time, life, distance;
	//캐릭터
	private ImageIcon playChar;
	private JButton playerButton;
	private int charLocationX, charLocationY;
	//함정
	private JButton trapLocButton, lifeLocButton, timeLocButton;
	private ImageIcon timeItem, lifeItem, bombItem;
	//게임오버 체크
	private boolean gameOver;
	
	//이벤트 검사
	Timer t1, t2;
	
	private CommonFrame commonF;
	
	GamePanel(CommonFrame commonF) {
		this.commonF = commonF;
		setLayout(new BorderLayout());
		initComponent();
		initEvent();
		initTimeChk();
		initTrap();
		initLifeItem();
		initTimeItem();
		initGameOverChk();
		t1.stop();
		t2.stop();
	}
	
	private void initEvent() {
		gameToHomeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e1) {
				gameToHomeBtn.setIcon(commonF.toMainIcon2);
				commonF.sound.menuSelectEffectSound();
				commonF.sound.playEffectSound();
			}

			@Override
			public void mouseExited(MouseEvent e2) {
				gameToHomeBtn.setIcon(commonF.toMainIcon1);
				commonF.sound.menuSelectEffectSound();
				commonF.sound.playEffectSound();
			}

			@Override
			public void mouseReleased(MouseEvent e3) {
				commonF.cL.show(commonF.getContentPane(), "MainPage");
				if(commonF.sound.clip1.isActive()) {
					commonF.sound.endSound();
				}
				commonF.sound.mainMenuSound();
				commonF.sound.playSound();
				t1.stop();
				t2.stop();
			}
		});
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				requestFocus();
				playerButton = buttons[charLocationY][charLocationX];
				initObjectChk();
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					if(charLocationX == 0) {
						return;
					}else if(buttons[charLocationY][charLocationX-1].getBackground() == Color.WHITE) {
						return;
					}
					playerButton.setBackground(Color.WHITE);
					if("..".equals(playerButton.getText())) {
						playerButton.setIcon(timeItem);
						playerButton.setText(null);
					}else if("...".equals(playerButton.getText())) {
						playerButton.setIcon(lifeItem);
						playerButton.setText(null);
					}else if("!".equals(playerButton.getText())){
						playerButton.setIcon(bombItem);
						playerButton.setText(null);
					}else {
						playerButton.setIcon(null);
						playerButton.setText(null);
					}
					charLocationX -= 1;
					playerButton = buttons[charLocationY][charLocationX];
					playerButton.setIcon(playChar);
				}	else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(charLocationX == buttons.length-1) {
						return;
					}else if(buttons[charLocationY][charLocationX+1].getBackground() == Color.WHITE) {
						return;
					}
					playerButton.setBackground(Color.WHITE);
					if("..".equals(playerButton.getText())) {
						playerButton.setIcon(timeItem);
						playerButton.setText(null);
					}else if("...".equals(playerButton.getText())) {
						playerButton.setIcon(lifeItem);
						playerButton.setText(null);
					}else if("!".equals(playerButton.getText())){
						playerButton.setIcon(bombItem);
						playerButton.setText(null);
					}else {
						playerButton.setIcon(null);
						playerButton.setText(null);
					}
					charLocationX += 1;
					playerButton = buttons[charLocationY][charLocationX];
					buttons[charLocationY][charLocationX].setIcon(playChar);
				}	else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(charLocationY == 14) {
						for(int k = 0; k < buttons.length;k++) {
							for(int q = 0; q < buttons[k].length; q++) {
								buttons[k][q].setBackground(Color.BLACK);
								buttons[k][q].setIcon(null);
								buttons[k][q].setText(".");
							}
						}
						playerButton.setIcon(null);
						charLocationY = 0;
						playerButton = buttons[charLocationY][charLocationX];
						buttons[charLocationY][charLocationX].setIcon(playChar);
						initTrap();
						initLifeItem();
						initTimeItem();
						distance += 5;
						distanceLabel.setText(distance+"M");
					}	else {
						playerButton.setBackground(Color.WHITE);
						if("..".equals(playerButton.getText())) {
							playerButton.setIcon(timeItem);
							playerButton.setText(null);
						}else if("...".equals(playerButton.getText())) {
							playerButton.setIcon(lifeItem);
							playerButton.setText(null);
						}else if("!".equals(playerButton.getText())){
							playerButton.setIcon(bombItem);
							playerButton.setText(null);
						}else {
							playerButton.setIcon(null);
							playerButton.setText(null);
						}
						charLocationY += 1;
						playerButton = buttons[charLocationY][charLocationX];
						buttons[charLocationY][charLocationX].setIcon(playChar);
						distance += 5;
						distanceLabel.setText(distance+"M");
					}
				}
			}
		});
	}

	private void initGameOverChk() {
		t2 = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gameOver) {
					commonF.sound.endSound();
					commonF.sound.gameOverEffectSound();
					commonF.sound.playEffectSound();
					t1.stop();
					int dialog = JOptionPane.showConfirmDialog
							         (null, "다시 하시겠습니까?", "You Die",JOptionPane.YES_NO_OPTION);
					if(dialog == 0) {
						initRestart();
						commonF.sound.endEffectSound();
						commonF.sound.gamePlaySound();
						commonF.sound.playSound();
					}else {
						commonF.cL.show(commonF.getContentPane(), "MainPage");
						commonF.sound.endEffectSound();
						commonF.sound.mainMenuSound();
						commonF.sound.playSound();
						t2.stop();
					}
				}
			}
		});
		t2.start();
	}
	
	void initRestart() {
		buttons[charLocationY][charLocationX].setIcon(null);
		time = 30;
		life = 5;
		distance = 0;
		charLocationX = 7;
		charLocationY = 0;
		playerButton = buttons[charLocationY][charLocationX];
		for(int k = 0; k < buttons.length;k++) {
			for(int q = 0; q < buttons[k].length; q++) {
				buttons[k][q].setBackground(Color.BLACK);
				buttons[k][q].setIcon(null);
				buttons[k][q].setText(".");
			}
		}
		playerButton.setIcon(playChar);
		initTrap();
		initLifeItem();
		initTimeItem();
		lifeLabel.setText(life+"life");
		timeLabel.setText(time+"초");
		distanceLabel.setText(distance+"M");
		t1.restart();
		t2.restart();
		gameOver = false;
	}
	
	private void initObjectChk() {
		if("!".equals(playerButton.getText())){
			life--;
			lifeLabel.setText(life+"life");
			commonF.sound.loseLifeEffectSound();
			commonF.sound.playEffectSound();
			if(life == 0) {
				gameOver = true;
			}
		}else if("...".equals(playerButton.getText())) {
			life++;
			lifeLabel.setText(life+"life");
			commonF.sound.getLifeItemEffectSound();
			commonF.sound.playEffectSound();
		}else if("..".equals(playerButton.getText())) {
			time++;
			timeLabel.setText(time+"초");
			commonF.sound.getTimeItemEffectSound();
			commonF.sound.playEffectSound();
		}
	}
	
	private void initTimeChk() {
		t1 = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				time--;
				timeLabel.setText(time+"초");
				if(time == 0) {
					gameOver = true;
				}
			}
		});
		t1.start();
	}
	
	private void initTimeItem() {
		int timeItemCounter = 0;
		int timeLocX;
		int timeLocY;
		while(true) {
			if(timeItemCounter > 5) {
				timeItemCounter = 0;
				return;
			}
			timeLocX = (int) (Math.random()*(buttons.length));
			timeLocY = (int) (Math.random()*(buttons.length));
			timeLocButton = buttons[timeLocY][timeLocX];
			if(timeLocButton == playerButton) {
				continue;
			}else if(".".equals(timeLocButton.getText())) {
				timeLocButton.setText("..");
				timeItemCounter++;
			}
		}
	}

	private void initLifeItem() {
		int lifeItemCounter = 0;
		int lifeLocX;
		int lifeLocY;
		while(true) {
			if(lifeItemCounter > 5) {
				lifeItemCounter = 0;
				return;
			}
			lifeLocX = (int) (Math.random()*(buttons.length));
			lifeLocY = (int) (Math.random()*(buttons.length));
			lifeLocButton = buttons[lifeLocY][lifeLocX];
			if(lifeLocButton == playerButton) {
				continue;
			}else if (lifeLocButton == timeLocButton) {
				continue;
			}else if(".".equals(lifeLocButton.getText())) {
				lifeLocButton.setText("...");
				lifeItemCounter++;
			}
		}
	}
	
	private void initTrap() {
		int trapCounter = 0;
		int trapLocX;
		int trapLocY;
		for(int a = 0; a < buttons.length;a++) {
			for(int b = 0; b < buttons[a].length; b++) {
				buttons[a][b].setText(".");
			}
		}
		while(true) {
			if(trapCounter > 30) {
				trapCounter = 0;
				return;
			}
			trapLocX = (int) (Math.random()*(buttons.length));
			trapLocY = (int) (Math.random()*(buttons.length));
			trapLocButton = buttons[trapLocY][trapLocX];
			if(trapLocButton == playerButton) {
				continue;
			}else if(".".equals(trapLocButton.getText())) {
				trapLocButton.setText("!");
				trapCounter++;
			}
		}
	}
	
	private void initComponent() {
		time = 30;
		life = 5;
		distance = 0;
		charLocationX = 7;
		charLocationY = 0;
		mainPanel = new JPanel(new BorderLayout());
		//게임 진행
		lifeItem = new ImageIcon("src/imagefile/회복 원본.jpg");
		timeItem = new ImageIcon("src/imagefile/시계 원본.jpg");
		bombItem = new ImageIcon("src/imagefile/폭탄 원본.jpg");
		commonF.toMainIcon1 = new ImageIcon("src/imagefile/toMainG2.png");
		commonF.toMainIcon2 = new ImageIcon("src/imagefile/toMainY2.png");
		playChar = new ImageIcon("src/imagefile/광부1.jpg");
		playPanel = new JPanel(new GridLayout(15, 15,0,0));
		buttons = new JButton[15][15];
		for(int i = 0; i < buttons.length;i++) {
			for(int j = 0; j < buttons[i].length; j++) {
				JButton btn = new JButton();
				buttons[i][j] = btn;
				btn.setBackground(Color.BLACK);
				btn.setForeground(Color.BLACK);
				btn.setText(".");
				btn.setBorderPainted(false); 
				btn.setFocusPainted(false); 
				playPanel.add(btn);
			}
		}
		buttons[charLocationY][charLocationX].setIcon(playChar);
		//우측 메뉴 및 상태표시창
		statusPanel = new JPanel(new GridLayout(4, 1));
		gameToHomeBtn = new JButton();
		timeLabel = new JLabel(time+"초");
		lifeLabel = new JLabel(life+"life");
		distanceLabel = new JLabel(distance+"M");
		gameToHomeBtn.setIcon(commonF.toMainIcon1);
		gameToHomeBtn.setBorderPainted(false); 
		gameToHomeBtn.setFocusPainted(false); 
		gameToHomeBtn.setContentAreaFilled(false);
		timeLabel.setFont(new Font("default", Font.BOLD, 25));
		timeLabel.setForeground(Color.BLUE);
		lifeLabel.setFont(new Font("default", Font.BOLD, 25));
		lifeLabel.setForeground(Color.RED);
		distanceLabel.setFont(distanceLabel.getFont().deriveFont(20f));
		distanceLabel.setForeground(Color.MAGENTA);
		statusPanel.setBackground(Color.WHITE);
		statusPanel.add(timeLabel);
		statusPanel.add(lifeLabel);
		statusPanel.add(distanceLabel);
		statusPanel.add(gameToHomeBtn);
		
		playPanel.setBackground(Color.BLACK);
		
		mainPanel.add(playPanel);
		mainPanel.add(statusPanel, BorderLayout.EAST);
		add(mainPanel);
		initTrap();
		initLifeItem();
		initTimeItem();
	}

}
