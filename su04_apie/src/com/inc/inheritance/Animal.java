package com.inc.inheritance;

import java.awt.Point;

public class Animal {
	Point point;
	int gender;
	boolean isAlive;
	
	void move(int x, int y) {
		point.x += x;
		point.y += y;
	}
}
