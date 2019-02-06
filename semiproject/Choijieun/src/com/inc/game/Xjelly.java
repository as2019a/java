package com.inc.game;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class Xjelly {
	Point p;
	private Image image;
	
	public Xjelly() {
		int r = (int)(Math.random()*1001);
		p = new Point(r, 0);
		double r2 = Math.random();
		if(r2 > 0.34) {
			image = new ImageIcon("src/com/inc/jelly/jelly3.png").getImage();
		}
	}
	
	public Image getImage() {
		return image;
	}
}
