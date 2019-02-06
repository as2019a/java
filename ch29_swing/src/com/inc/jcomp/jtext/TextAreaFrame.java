package com.inc.jcomp.jtext;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame {
	private JTextArea textArea;
	
	private TextAreaFrame() {
		setTitle("Main frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,300,500,500);
		setLayout(new FlowLayout());
		initComponent();
		setVisible(true);
	}
	
	private void initComponent() {
		textArea = new JTextArea(10, 40);
		//add(textArea);
		JScrollPane scrollPane = 
				new JScrollPane(textArea, 
						JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
						JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane);
	}

	public static void main(String[] args) {
		new TextAreaFrame();
	}

}
