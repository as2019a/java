package com.inc.game;

import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{ //맨첨 열리는 곳
	
	boolean isHovered;
	JButton play = new JButton("play");
	JButton help = new JButton("help");
	JButton exit = new JButton("exit");
	
	ImageIcon menubkg = new ImageIcon("src/com/inc/images/menubkg2.jpg");
	
	ImageIcon playbtn = new ImageIcon("src/com/inc/images/play.png"); 
	ImageIcon playP = new ImageIcon("src/com/inc/images/playP.png");
	
	ImageIcon helpbtn = new ImageIcon("src/com/inc/images/help.png");
	ImageIcon helpP = new ImageIcon("src/com/inc/images/helpP.png");
	
	ImageIcon exitbtn = new ImageIcon("src/com/inc/images/exit.png");
	ImageIcon exitP = new ImageIcon("src/com/inc/images/exitP.png");
	
	JLabel center = new JLabel();

	MenuPanel(){
		//배치관리 자동 y축 정렬
		//center.setLayout((LayoutManager) new BoxLayout(center,BoxLayout.Y_AXIS));
		
		
		center.setIcon(menubkg);
		play.setIcon(playbtn); 
		play.setBounds(540, 300, 220, 60);
		play.setBorderPainted(false); //임시
		play.setContentAreaFilled(false);
		play.setFocusPainted(false);
		
		help.setIcon(helpbtn);
		help.setBounds(540, 405, 220, 60);
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		help.setFocusPainted(false);
		
		exit.setIcon(exitbtn);
		exit.setBounds(540, 510, 220, 60);
		exit.setBorderPainted(false);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		
		play.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				play.setIcon(playbtn);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				play.setIcon(playP);
			}
		});
		
		help.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				help.setIcon(helpbtn);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				help.setIcon(helpP);
			}
		});
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				exit.setIcon(exitbtn);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				exit.setIcon(exitP);
			}
		});
			
		
		 
		add(center); 
		center.add(play);
		center.add(help);
		center.add(exit);
		play.addMouseListener(new Click());
		help.addMouseListener(new Click());
		exit.addMouseListener(new Click());
		}

}
