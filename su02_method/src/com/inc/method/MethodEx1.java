package com.inc.method;

public class MethodEx1 {

	public static void main(String[] args) {
		//1.코드 중복 방지(유지보수 쉬워짐)
		//2.가독성 증가
		hello();
		//코드
		hello();
		//코드
		hello();
	}
	
	public static void hello() {
		System.out.println("Hello World");
	}
}
