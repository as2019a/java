package com.inc.button;

import java.awt.Color;
import java.io.Serializable;

public class Click implements Serializable{
	int row, column;
	private Color c;
	public Click(int row, int column, Color c) {
		this.row = row;
		this.column = column;
		this.c = c;
	}
	
	public Color getColor() {
		return c;
	}
	
	
}
