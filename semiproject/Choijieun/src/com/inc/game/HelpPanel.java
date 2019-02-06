package com.inc.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HelpPanel extends JPanel{

	Image helpbkg = new ImageIcon("src/com/inc/images/helpbkg2.jpg").getImage(); 
	JButton back = new JButton(""); 
	ImageIcon backBtn = new ImageIcon("src/com/inc/images/restartBtn.png"); 
	ImageIcon backP = new ImageIcon("src/com/inc/images/backP.png"); 
	
	HelpPanel() {
		back.setIcon(backBtn);
		back.setBounds(510, 100, 220, 60);
		back.setBorderPainted(false); //임시
		back.setContentAreaFilled(false);
		back.setFocusPainted(false);
		
		setFocusable(true); 
		add(back); 

		back.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				Game.cardlayout.show(Game.cards, "MenuPanel");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				back.setIcon(backBtn);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				back.setIcon(backP);
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(helpbkg, 0, 0, null); 
	
		repaint();
	}
}


