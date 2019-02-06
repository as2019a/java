package com.inc.digginggame.v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
	private JPanel infoPagePanel;
	private BufferedImage backImage;
	private JButton infoToHomeBtn;
	private CommonFrame commonF;

	InfoPanel(CommonFrame commonF) {
		this.commonF = commonF;
		setLayout(new BorderLayout());
		initComponent();
		initEvent();
	}

	private void initEvent() {
		infoToHomeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e1) {
				infoToHomeBtn.setIcon(commonF.toMainIcon2);
				commonF.sound.menuSelectEffectSound();
				commonF.sound.playEffectSound();
			}

			@Override
			public void mouseExited(MouseEvent e2) {
				infoToHomeBtn.setIcon(commonF.toMainIcon1);
				commonF.sound.menuSelectEffectSound();
				commonF.sound.playEffectSound();
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				commonF.cL.show(commonF.getContentPane(), "MainPage");
				commonF.sound.endSound();
				commonF.sound.mainMenuSound();
				commonF.sound.playSound();
			}
		});
	}

	private void initComponent() {
		//배경 삽입
		try {
			backImage = ImageIO.read(new File("src/imagefile/인포배경.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		infoPagePanel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				g.drawImage(backImage, 0, 0, null);
			}
		};
		infoPagePanel.setLayout(null);
		commonF.toMainIcon1 = new ImageIcon("src/imagefile/toMainG2.png");
		commonF.toMainIcon2 = new ImageIcon("src/imagefile/toMainY2.png");
		infoToHomeBtn = new JButton();
		infoToHomeBtn.setIcon(commonF.toMainIcon1);
		infoToHomeBtn.setBorderPainted(false); 
		infoToHomeBtn.setFocusPainted(false); 
		infoToHomeBtn.setContentAreaFilled(false);
		infoToHomeBtn.setBounds(650,650,70,70);
		
		infoPagePanel.add(infoToHomeBtn);
		add(infoPagePanel);
		}
	
}
