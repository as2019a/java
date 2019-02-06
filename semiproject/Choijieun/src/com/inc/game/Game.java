package com.inc.game;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{

	static MenuPanel mp = new MenuPanel();
	static GamePanel gp = new GamePanel();
	static HelpPanel hp = new HelpPanel(); 
	static CardLayout cardlayout = new CardLayout();
	static JPanel cards = new JPanel(); 

	Game() {
		cards.setLayout(cardlayout);
		cards.add(mp, "MenuPanel");
		cards.add(gp, "GamePanel");
		cards.add(hp, "HelpPanel");
		add(cards);
		cardlayout.show(cards, "MenuPanel");
		
		setTitle("CATCH THE JELLY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1050, 700);
		
		

	}

	public static void main(String args[]){
			Game g = new Game();
			g.setVisible(true);
		}
	}