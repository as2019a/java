package com.inc.operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		int b = 3;
		if(b <= 10 && b >= 0) {
			System.out.println("성공");
			
		}
		if(0 <= b && b<= 10) {
			System.out.println("성공");
			
		}
		if(b < 10 || b > 0) {
			System.out.println("성공");
		}
		System.out.println( true || true && false);

	}

}
