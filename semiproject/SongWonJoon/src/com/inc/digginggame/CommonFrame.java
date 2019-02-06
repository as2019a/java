package com.inc.digginggame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CommonFrame extends JFrame {
	
	private CardLayout cL;
	private JPanel mainPagePanel, gamePagePanel, infoPagePanel;
	//mainPage
	private JButton startBtn, infoBtn, exitBtn;
	//gamePage
	private JButton gameToHomeBtn;
	//infoPage
	private JButton infoToHomeBtn;
	
	private CommonFrame() {
		setTitle("Digging Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 100, 500, 500);
		setResizable(false);
		cL = new CardLayout();
		setLayout(cL);
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initEvent() {
		MouseListener pagePanel = new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String text = ((JButton)e.getComponent()).getText();
				if("Start".equals(text)) {
					cL.show(getContentPane(), "GamePage");
				}else if("Information".equals(text)) {
					cL.show(getContentPane(), "InfoPage");
				}else if("Exit".equals(text)){
					System.exit(0);
				}else if("Main...".equals(text)){
					cL.show(getContentPane(), "MainPage");
				}
			}
		};
		startBtn.addMouseListener(pagePanel);
		infoBtn.addMouseListener(pagePanel);
		exitBtn.addMouseListener(pagePanel);
		gameToHomeBtn.addMouseListener(pagePanel);
		infoToHomeBtn.addMouseListener(pagePanel);	
	}

	private void initComponent() {
		//main
		mainPagePanel = new JPanel();
		startBtn = new JButton("Start");
		infoBtn = new JButton("Information");
		exitBtn = new JButton("Exit");
		mainPagePanel.add(startBtn);
		mainPagePanel.add(infoBtn);
		mainPagePanel.add(exitBtn);
		add(mainPagePanel,"MainPage");
		
		//game
		gamePagePanel = new JPanel();
		gamePagePanel.setLayout(new BorderLayout());
		gameToHomeBtn = new JButton("Main...");
		gamePagePanel.add(gameToHomeBtn,BorderLayout.NORTH);
		add(gamePagePanel,"GamePage");
		//info
		infoPagePanel = new JPanel();
		infoPagePanel.setLayout(new BorderLayout());
		infoToHomeBtn = new JButton("Main...");
		infoPagePanel.add(infoToHomeBtn,BorderLayout.NORTH);
		add(infoPagePanel,"InfoPage");
	}
	
	public static void main(String[] args) {
		new CommonFrame();
	}
}
