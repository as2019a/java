package com.inc.event.v6;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.CharacterIterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowEventFrame extends JFrame {
	
	private WindowEventFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(new FlowLayout());
		initComponent();
		initEvent();
		setVisible(true);
	}

	private void initEvent() {
		addWindowFocusListener(new WindowAdapter() {
			
			private int choice;

			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showConfirmDialog(
						getContentPane(), "종료하시겠습니까?", "확인창", 
						JOptionPane.YES_NO_OPTION);
					if(choice == 0) {
						System.exit(0);
					}
			}
		});
		
	}

	private void initComponent() {
		
	}

	public static void main(String[] args) {
		new WindowEventFrame();
	}

}