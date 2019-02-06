package com.inc.digginggame.v1;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CommonFrame extends JFrame {
	
	private JPanel mainPagePanel;
	//mainPage
	private JButton startBtn, infoBtn, exitBtn;
	//하단부panel
	private JPanel southPanel;
	private ImageIcon startBtnIcon1, infoBtnIcon1, exitBtnIcon1;
	private ImageIcon startBtnIcon2, infoBtnIcon2, exitBtnIcon2;
	private BufferedImage backGroundImage;
	ImageIcon toMainIcon1, toMainIcon2;
	//기타선언
	CardLayout cL;
	GamePanel gameP;
	InfoPanel infoP;
	Sound sound = new Sound();
	
	CommonFrame() {
		setTitle("Digging Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 100, 750, 750);
		setResizable(false);
		cL = new CardLayout();
		gameP = new GamePanel(this);
		infoP = new InfoPanel(this);
		setLayout(cL);
		initComponent();
		initEvent();
		setVisible(true);
		sound.mainMenuSound();
		sound.playSound();
	}

	private void initEvent() {
		MouseListener pagePanel = new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e1) {
				Icon icon = ((JButton)e1.getComponent()).getIcon();
				if(startBtnIcon1.equals(icon)) {
					startBtn.setIcon(startBtnIcon2);
					sound.menuSelectEffectSound();
					sound.playEffectSound();
				}else if(infoBtnIcon1.equals(icon)) {
					infoBtn.setIcon(infoBtnIcon2);
					sound.menuSelectEffectSound();
					sound.playEffectSound();
				}else if(exitBtnIcon1.equals(icon)){
					exitBtn.setIcon(exitBtnIcon2);
					sound.menuSelectEffectSound();
					sound.playEffectSound();
				}
			}

			@Override
			public void mouseExited(MouseEvent e2) {
				Icon icon = ((JButton)e2.getComponent()).getIcon();
				if(startBtnIcon2.equals(icon)) {
					startBtn.setIcon(startBtnIcon1);
				}else if(infoBtnIcon2.equals(icon)) {
					infoBtn.setIcon(infoBtnIcon1);
				}else if(exitBtnIcon2.equals(icon)){
					exitBtn.setIcon(exitBtnIcon1);
				}
			}

			@Override
			public void mouseReleased(MouseEvent e3) {
				Icon icon = ((JButton)e3.getComponent()).getIcon();
				if(startBtnIcon2.equals(icon)) {
					cL.show(getContentPane(), "GamePage");
					sound.endSound();
					sound.gamePlaySound();
					sound.playSound();
					gameP.initRestart();
					gameP.requestFocus();
				}else if(infoBtnIcon2.equals(icon)) {
					cL.show(getContentPane(), "InfoPage");
					sound.endSound();
					sound.infoPageSound();
					sound.playSound();
				}else if(exitBtnIcon2.equals(icon)){
					sound.endSound();
					sound.exitEffectSound();
					sound.playEffectSound();
					try {
						Thread.sleep(1700);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.exit(0);
				}
			}
		};
		startBtn.addMouseListener(pagePanel);
		infoBtn.addMouseListener(pagePanel);
		exitBtn.addMouseListener(pagePanel);
	}

	private void initComponent() {
		//main
		try {
			backGroundImage = ImageIO.read(new File("src/imagefile/메인 배경.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		mainPagePanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(backGroundImage, 0, 0, null);
			}
		};
		mainPagePanel.setLayout(null);
		southPanel = new JPanel(new GridLayout(3, 1));
		startBtn = new JButton();
		infoBtn = new JButton();
		exitBtn = new JButton();
		southPanel.setPreferredSize(new Dimension(500,200));
		startBtnIcon1 = new ImageIcon("src/imagefile/startBtnB.png");
		startBtnIcon2 = new ImageIcon("src/imagefile/startBtnG.png");
		infoBtnIcon1 = new ImageIcon("src/imagefile/infoBtnB.png");
		infoBtnIcon2 = new ImageIcon("src/imagefile/infoBtnG.png");
		exitBtnIcon1 = new ImageIcon("src/imagefile/exitBtnB.png");
		exitBtnIcon2 = new ImageIcon("src/imagefile/exitBtnG.png");
		startBtn.setIcon(startBtnIcon1);
		startBtn.setBorderPainted(false); 
		startBtn.setFocusPainted(false); 
		startBtn.setContentAreaFilled(false);
		startBtn.setBounds(290,450,200,60);
		infoBtn.setIcon(infoBtnIcon1);
		infoBtn.setBorderPainted(false); 
		infoBtn.setFocusPainted(false); 
		infoBtn.setContentAreaFilled(false);
		infoBtn.setBounds(290,525,200,60);
		exitBtn.setIcon(exitBtnIcon1);
		exitBtn.setBorderPainted(false); 
		exitBtn.setFocusPainted(false); 
		exitBtn.setContentAreaFilled(false);
		exitBtn.setBounds(290,600,200,60);
		mainPagePanel.add(startBtn);
		mainPagePanel.add(infoBtn);
		mainPagePanel.add(exitBtn);
		
		add(mainPagePanel,"MainPage");
		
		//game
		add(gameP,"GamePage");
		//gameP.t1.stop();
		//gameP.t2.stop();
		//info
		add(infoP,"InfoPage");
	}
	
	public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
      	new CommonFrame();
      }
    });
	}
}
