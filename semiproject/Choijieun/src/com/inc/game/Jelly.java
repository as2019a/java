package com.inc.game;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class Jelly {
	Point p;
	private Image image;
	
	public Jelly() {
		int r = (int)(Math.random()*1001);
		p = new Point(r, 0);
		double r2 = Math.random();
		if(r2 > 0.67) {
			image = new ImageIcon("src/com/inc/jelly/jelly1.png").getImage();
		}else if(r2 > 0.34) {
			image = new ImageIcon("src/com/inc/jelly/jelly2.png").getImage();
		}else {
			image = new ImageIcon("src/com/inc/jelly/jelly4.png").getImage();
		}
	}

	public Image getImage() {
		return image;
	}
	
	
	
}
