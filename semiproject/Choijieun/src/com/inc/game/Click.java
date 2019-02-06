package com.inc.game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

	class Click extends MouseAdapter{

	public void mouseClicked(MouseEvent me) {
		JButton btn = (JButton)me.getComponent();
		
		if (btn.getText().equals("play")) {
			Game.cardlayout.show(Game.cards, "GamePanel");
		}else if (btn.getText().equals("help")) {
				Game.cardlayout.show(Game.cards, "HelpPanel"); 
		}else if (btn.getText().equals("exit")) {
				System.exit(0);
			}
		} 
	}
