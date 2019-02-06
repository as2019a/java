package com.inc.jpanel.v1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelFame extends JFrame{
	
	private JMenuBar menuBar;
	private JMenu fileBar;
	private JMenu editBar;
	
	//west
	private JPanel westPanel;
	private JButton redBtn;
	private JButton blueBtn;
	private JButton greenBtn;
	private JButton yellowBtn;
	
	//center
	private JPanel centerpanel;
	
	//south
	private JPanel southPanel;
	private JTextArea textArea;
	private JTextField textField;
	private JButton sendBtn;
	private JMenu fileMenu;
	private JMenu editMenu;
	
	private PanelFame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		//cardLayout = new CardLayout();
		//setLayout(cardLayout);
		initComponent();
		//initEvent();
		setVisible(true);
	}
	
	
	private void initComponent() {
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		add(menuBar, BorderLayout.NORTH);
		
		initWest();
		
		centerpanel = new JPanel();
		centerpanel.setBackground(Color.BLACK);
		add(centerpanel);
		
		initSouth();
		
		
	}
	
	private void initWest() {
		westPanel = new JPanel(new GridLayout(2, 2));
		redBtn = new JButton();
		blueBtn = new JButton();
		greenBtn = new JButton();
		yellowBtn = new JButton();
		
		redBtn.setBackground(Color.RED);
		blueBtn.setBackground(Color.BLUE);
		greenBtn.setBackground(Color.GREEN);
		yellowBtn.setBackground(Color.YELLOW);
		
		westPanel.add(redBtn);
		westPanel.add(blueBtn);
		westPanel.add(greenBtn);
		westPanel.add(yellowBtn);
		
		add(westPanel, BorderLayout.WEST);
		
	}
	
	private void initSouth() {
		southPanel = new JPanel();
		southPanel.setLayout(new BorderLayout());
		textArea = new JTextArea();
		textField = new JTextField();
		sendBtn = new JButton("Send");
		southPanel.add(textArea);
		southPanel.add(sendBtn, BorderLayout.EAST);
		southPanel.add(textField, BorderLayout.SOUTH);
		add(southPanel, BorderLayout.SOUTH);
		
		
	}
	

	public static void main(String[] args) {
		new PanelFame();

	}

}
