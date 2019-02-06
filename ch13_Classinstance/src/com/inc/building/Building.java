package com.inc.building;

public class Building {
	String name;
	int year;
	int count;
	
	public void getinfo() {
		System.out.printf("건물명 : %s, 건물연식 : %d, 인구수 : %d명\n", name, year, count);
	}
	
	public void in() {
		count++;
	}
	
	public void out() {
		count--;
	}

}
