package com.inc.example;

public class Hello {
	//기본생성자는 선언하지 않으면 JVM이 선언해 준다.
	//void X(규칙)
	public Hello() {
		System.out.println("Hello constructor");
	}
	
	public void hello() {
		System.out.println("hello method");
	}
}
