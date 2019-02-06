package com.inc.digginggame;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class GameFrame2 extends JPanel {
	
	JButton gameToHomeBtn;
	private JPanel mainPanel;
	private JPanel playPanel;
	private JPanel statusPanel;
	private JButton[][] buttons;
	private JLabel lifeLabel;
	private JLabel timeLabel;
	private JLabel distanceLabel;
	private int time;
	private int life;
	private int distance;
	//캐릭터
	private ImageIcon playChar;
	private JButton playerButton;
	private int charLocationX;
	private int charLocationY;
	//함정
	private JButton trapLocButton;
	private JButton lifeLocButton;
	private JButton timeLocButton;
	private ImageIcon timeItem;
	private ImageIcon lifeItem;
	//게임오버 체크
	private boolean gameOver;
	
	//이벤트 검사
	Timer t1;
	Timer t2;
	
	GameFrame2() {
		setBounds(500, 100, 600, 600);
		setLayout(new BorderLayout());
		initComponent();
		initButtonEvent();
		initTimeChk();
		initTrap();
		initLifeItem();
		initTimeItem();
		setVisible(true);
		initGameOverChk();
	}
	
	private void initButtonEvent() {
		gameToHomeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
	}

	private void initGameOverChk() {
		t2 = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(gameOver) {
					t1.stop();
					int dialog = JOptionPane.showConfirmDialog
							         (null, "다시 하시겠습니까?", "You Die",JOptionPane.YES_NO_OPTION);
					if(dialog == 0) {
						initRestart();
					}else {
						System.exit(0);
					}
				}
			}
		});
		t2.start();
	}
	
	private void initRestart() {
		buttons[charLocationY][charLocationX].setIcon(null);
		time = 60;
		life = 3;
		distance = 0;
		charLocationX = 7;
		charLocationY = 0;
		buttons[charLocationY][charLocationX].setIcon(playChar);
		for(int k = 0; k < buttons.length;k++) {
			for(int q = 0; q < buttons[k].length; q++) {
				buttons[k][q].setBackground(Color.BLACK);
				
			}
		}
		initTrap();
		initLifeItem();
		initTimeItem();
		t1.restart();
		gameOver = false;
	}
	
	private void initObjectChk() {
		if("!".equals(playerButton.getText())){
			life--;
			lifeLabel.setText(life+"life");
			if(life == 0) {
				gameOver = true;
			}
		}else if("L".equals(playerButton.getText())) {
			life++;
			lifeLabel.setText(life+"life");
		}else if("T".equals(playerButton.getText())) {
			time++;
			timeLabel.setText(time+"초");
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
			timeLocX = (int) (Math.random()*(buttons.length-1));
			timeLocY = (int) (Math.random()*(buttons.length-1));
			timeLocButton = buttons[timeLocY][timeLocX];
			if(timeLocButton == playerButton) {
				continue;
			}else if(".".equals(timeLocButton.getText())) {
				timeLocButton.setText("T");
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
			lifeLocX = (int) (Math.random()*(buttons.length-1));
			lifeLocY = (int) (Math.random()*(buttons.length-1));
			lifeLocButton = buttons[lifeLocY][lifeLocX];
			if(lifeLocButton == playerButton) {
				continue;
			}else if (lifeLocButton == timeLocButton) {
				continue;
			}else if(".".equals(lifeLocButton.getText())) {
				lifeLocButton.setText("L");
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
			trapLocX = (int) (Math.random()*(buttons.length-1));
			trapLocY = (int) (Math.random()*(buttons.length-1));
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
		time = 60;
		life = 3;
		distance = 0;
		charLocationX = 7;
		charLocationY = 0;
		mainPanel = new JPanel(new BorderLayout());
		//게임 진행
		playChar = new ImageIcon("C:/increpas/java/example/ch31_image/src/com/inc/images/man.png");
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
				btn.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						playerButton = buttons[charLocationY][charLocationX];
						initObjectChk();
						if(e.getKeyCode() == KeyEvent.VK_LEFT) {
							if(charLocationX == 0) {
								return;
							}
							playerButton.setBackground(Color.WHITE);
							playerButton.setIcon(null);
							charLocationX -= 1;
							playerButton = buttons[charLocationY][charLocationX];
							playerButton.setIcon(playChar);
						}	else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
							if(charLocationX == buttons.length-1) {
								return;
							}
							playerButton.setBackground(Color.WHITE);
							playerButton.setIcon(null);
							charLocationX += 1;
							playerButton = buttons[charLocationY][charLocationX];
							buttons[charLocationY][charLocationX].setIcon(playChar);
						}	else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
							if(charLocationY == 14) {
								playerButton.setIcon(null);
								for(int k = 0; k < buttons.length;k++) {
									for(int q = 0; q < buttons[k].length; q++) {
										buttons[k][q].setBackground(Color.BLACK);
										
									}
								}
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
								playerButton.setIcon(null);
								charLocationY += 1;
								playerButton = buttons[charLocationY][charLocationX];
								buttons[charLocationY][charLocationX].setIcon(playChar);
								distance += 5;
								distanceLabel.setText(distance+"M");
							}
						}
					}
				});
				playPanel.add(btn);
			}
		}
		buttons[charLocationY][charLocationX].setIcon(playChar);
		//우측 메뉴 및 상태표시창
		statusPanel = new JPanel(new GridLayout(4, 1));
		gameToHomeBtn = new JButton("Main...");
		timeLabel = new JLabel(time+"초");
		lifeLabel = new JLabel(life+"life");
		distanceLabel = new JLabel(distance+"M");
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

	public static void main(String[] args) {
		new GameFrame2();
	}
}
