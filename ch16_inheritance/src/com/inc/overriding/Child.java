package com.inc.overriding;

public class Child extends Parent {
	
	void move() {
		System.out.println("꾸물꾸물");
		
	}
	
	//오버라이딩
	@Override
	void eat() {
		System.out.println("쩝쩝쩝");
	}
}
