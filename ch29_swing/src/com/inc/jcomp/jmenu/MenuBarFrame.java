package com.inc.jcomp.jmenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class MenuBarFrame extends JFrame{
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	//fileMenu
	JMenuItem newItem;
	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem saveAsItem;
	
	//editMenu
	JMenuItem fontItem;
	JMenuItem colorItem;
	
	//helpMenu
	JMenuItem webItem;
	JMenuItem callItem;
	
	private MenuBarFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,500,500);
		//setLayout(new FlowLayout());
		initMenu();
		initComponent();
		setVisible(true);
	}
	
	private void initMenu() {
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		//사이즈 조정
		Dimension d50 = new Dimension(50, 20);
		fileMenu.setPreferredSize(d50);
		editMenu.setPreferredSize(d50);
		helpMenu.setPreferredSize(d50);
		
		//단축키 추가(메뉴)
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		//file menu
		newItem = new JMenuItem("New");
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveAsItem = new JMenuItem("Save As...");
		
		//edit menu
		fontItem = new JMenuItem("Font");
		colorItem = new JMenuItem("Color");
				
		//help menu
		webItem = new JMenuItem("Web");
		callItem = new JMenuItem("Call");
		
		//단축키 추가(메뉴아이템)
		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		
		//openItem에 단축키 추가하고 
		newItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.RED);
			}
		});
		
		//openItem에 이벤트까지 추가(바탕색이 하얀색으로 변경)
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.white);
				
			}
		});
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(saveItem);
		fileMenu.add(saveAsItem);
		
		editMenu.add(fontItem);
		editMenu.add(colorItem);
		//메뉴에 메뉴 집어넣기(서브메뉴)
		editMenu.add(helpMenu);
		
		helpMenu.add(webItem);
		helpMenu.add(callItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		//menuBar.add(helpMenu);
		
		add(menuBar,"North");
	}
	
	private void initComponent() {
		
		
	}

	public static void main(String[] args) {
		new MenuBarFrame();

	}

}
