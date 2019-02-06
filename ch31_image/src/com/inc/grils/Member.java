package com.inc.grils;

import javax.swing.ImageIcon;

public class Member {
	private String name;
	private ImageIcon image;
	
	public Member(String name, ImageIcon image) {
		this.name = name;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public ImageIcon getImage() {
		return image;
	}
	
}
