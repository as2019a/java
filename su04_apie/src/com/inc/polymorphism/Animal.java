package com.inc.polymorphism;

import java.awt.Point;

public abstract class Animal {
	public Point point;
	private int gender;
	private boolean isAlive;
	
	void move(int x, int y) {
		point.x += x;
		point.y += y;
	}
	
	abstract void crying();

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}
