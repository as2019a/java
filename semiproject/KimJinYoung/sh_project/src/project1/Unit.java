package project1;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

public class Unit implements Serializable {

	private String id;
	Point p;
	private Color c;
	
	public Unit(String id, Color c) {
		this.id = id;
		this.c = c;
	}

	public String getId() {
		return id;
	}

	public Color getC() {
		return c;
	}
	
}
