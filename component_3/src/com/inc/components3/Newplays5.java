package com.inc.components3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public abstract class Newplays5  extends JFrame{
	public Newplays5() {
		super("BorderLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Newplays5();
	}
}