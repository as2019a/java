package com.inc.abstracT;

import java.awt.Point;

public abstract class Animal {
	Point point;
	int gender;
	boolean isAlive;
	
	void move(int x, int y) {
		point.x += x;
		point.y += y;
	}
	
	abstract void crying();
}
