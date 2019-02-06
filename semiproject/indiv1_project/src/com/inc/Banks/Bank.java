package com.inc.Banks;

public class Bank {
	
	private String point; // 은행위치
	static float interest; // 은행이자
	
	public Bank(String point) {
		this.point = point;
	}
	
	//결과 출력
	public void getInfo() {
		System.out.println("지점 : " + point);
		System.out.println("이자율 : " + interest);
	}
	
}
