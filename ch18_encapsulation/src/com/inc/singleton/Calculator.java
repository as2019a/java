package com.inc.singleton;

public class Calculator {
	
	//현재 클래스에 싱글턴패턴(singleton pattern)을 적용해 보세요
	
	//인스턴스를 저장할 변수 선언
	private Calculator instance;
	
	//생성자를 private으로
	public double sum(double a, double b) {
		return a + b;
	}
	
	public double sub(double a, double b)  {
		return a - b;
	}
	
	private static Calculator Calculator;
	
	private Calculator() {
	}
	
	public static Calculator getInstance() {
		if(Calculator == null) {
			Calculator = new Calculator();
		}
		return Calculator;
	}
}
