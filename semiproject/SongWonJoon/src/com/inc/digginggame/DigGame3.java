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
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DigGame3 extends JFrame{
	private JPanel mainPanel;
	private JPanel playPanel;
	private JPanel statusPanel;
	private JButton gameToHomeBtn;
	private JLabel[][] labels;
	private ImageIcon playChar;
	private ImageIcon item1;
	private ImageIcon box;
	private ImageIcon boxTrap;
	private ImageIcon basicTrap;
	private JLabel lifeLabel;
	private JLabel distanceLabel;
	private int life = 3;
	private int distance = 0;
	List<JButton[][]> locationList = new ArrayList<>();
	int charLocationX = 7;
	int charLocationY = 0;
	JLabel playerLabel;
	
	
	public DigGame3() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 100, 500, 500);
		setResizable(false);
		initComponent();
		initEvent();
		setVisible(true);
	}
	
	private void initEvent() {
		playPanel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				playerLabel.setBackground(Color.WHITE);
				playPanel.add(playerLabel);
				charLocationX -= 1;
				playerLabel.setIcon(playChar);
				playPanel.add(playerLabel);
				add(playPanel);
				}	else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				playerLabel.setBackground(Color.WHITE);
				charLocationX += 1;
				playerLabel.setIcon(playChar);
				}	else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				playerLabel.setBackground(Color.WHITE);
				charLocationY += 1;
				playerLabel.setIcon(playChar);
				}
			}		
		});
	}
	
	private void initComponent() {
		mainPanel = new JPanel(new BorderLayout());
		//우측 메뉴 및 상태표시창
		statusPanel = new JPanel();
		gameToHomeBtn = new JButton("메인으로");
		lifeLabel = new JLabel(life+"life");
		distanceLabel = new JLabel(distance+"M");
		statusPanel.add(lifeLabel);
		statusPanel.add(distanceLabel);
		statusPanel.add(gameToHomeBtn);
		//게임 진행
		playChar = new ImageIcon("C:/increpas/java/example/ch31_image/src/com/inc/images/man.png");
		playPanel = new JPanel(new GridLayout(15, 15,0,0));
		labels = new JLabel[15][15];
		for(int i = 0; i < labels.length;i++) {
			for(int j = 0; j < labels.length; j++) {
				JLabel lab = new JLabel();
				labels[i][j] = lab;
				lab.setBackground(Color.BLACK);
				playPanel.add(lab);
			}
		}
		playerLabel = labels[charLocationY][charLocationX];
		playerLabel.setIcon(playChar);
		
		playPanel.setBackground(Color.BLACK);
		
		mainPanel.add(playPanel);
		mainPanel.add(statusPanel, BorderLayout.EAST);
		add(mainPanel);
	}

	public static void main(String[] args) {
		new DigGame3();
	}
}
