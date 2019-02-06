package com.inc.member;

public class BuildingEx02 {
	//멤버변수는 초기화 하지 않으면 기본값이 할당
	//기본자료형의 기본값 : 정수->0,실수->0.0, boolean->false, char->' ',
	//참조자료형의 기본값 : null
	
	int floor = 5;
	String name;
	int year;
	
	void getInfo() {
		System.out.printf("층 : %d, 이름 : %s 연식 : %d\n", floor, name, year);
	}
}
