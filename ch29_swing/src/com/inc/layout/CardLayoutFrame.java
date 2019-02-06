package com.inc.layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutFrame  extends JFrame{
	private CardLayout cardLayout;
	
	private JButton moveFirstBtn, moveLastBtn;
	private JButton firstNextBtn, firstPrevBtn;
	private JButton secondNextBtn, secondPrevBtn;
	private JButton thirdNextBtn, thirdPrevBtn;
	
	private JPanel firstPanel;
	private JPanel secondPanel;
	private JPanel thirdPanel;
	
	
	
	private CardLayoutFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		initComponent();
		initEvent();
		setVisible(true);
	}
	
	private void initEvent() {
		MouseListener ml = new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {
				String text = ((JButton)e.getComponent()).getText();
				if("Next".equals(text)) {
					cardLayout.next(getContentPane());
				}else if("Previous".equals(text)) {
					cardLayout.previous(getContentPane());
				}else if("First".equals(text)) {
					cardLayout.first(getContentPane());
				}else {
					cardLayout.show(getContentPane(), "third");
				}
			}
			
		};
		moveFirstBtn.addMouseListener(ml);
		moveLastBtn.addMouseListener(ml);
		firstNextBtn.addMouseListener(ml);
		firstPrevBtn.addMouseListener(ml);
		secondNextBtn.addMouseListener(ml);
		secondPrevBtn.addMouseListener(ml);
		thirdNextBtn.addMouseListener(ml);
		thirdPrevBtn.addMouseListener(ml);
		
	}
	private void initComponent() {
		moveFirstBtn = new JButton("First");
		moveLastBtn = new JButton("Last");
		
		firstNextBtn = new JButton("Next");
		firstPrevBtn = new JButton("Previous");
		
		secondNextBtn = new JButton("Next");
		secondPrevBtn = new JButton("Previous");
		
		thirdNextBtn = new JButton("Next");
		thirdPrevBtn = new JButton("Previous");
		
		firstPanel = new JPanel();
		firstPanel.setBackground(Color.RED);
		
		secondPanel = new JPanel();
		secondPanel.setBackground(Color.ORANGE);
		
		thirdPanel = new JPanel();
		thirdPanel.setBackground(Color.GREEN);
		
		firstPanel.add(firstPrevBtn);
		firstPanel.add(moveLastBtn);
		firstPanel.add(firstNextBtn);
		
		secondPanel.add(secondPrevBtn);
		secondPanel.add(secondNextBtn);
		
		thirdPanel.add(thirdPrevBtn);
		thirdPanel.add(moveFirstBtn);
		thirdPanel.add(thirdNextBtn);
		
		add(firstPanel, "first");
		add(secondPanel);
		add(thirdPanel, "third");
	}

	public static void main(String[] args) {
		new CardLayoutFrame();
	}

}