package com.inc.bluemarble;

import java.io.Serializable;

import javax.swing.ImageIcon;

public class Player implements Serializable{
	int x =0;
	int y =0;
	private int money = 1000000;
	private ImageIcon image;
	private String btnName;
	
	public Player(ImageIcon image, String btnName) {
		this.image = image;
		this.btnName = btnName;
	}
	
	public String getBtnName() {
		return btnName;
	}

	public ImageIcon getImage() {
		return image;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
