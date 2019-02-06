package com.inc.example;

public class MethodEx04 {

	public static void main(String[] args) {
		
	sum(10, 30);
	sum(100, 350);
	sum(1000, 3360);
	lengthOfCircle(100);
	areaOfCircle(30);
	power(3, 5);
	
	}
	//실습1 : 원의 넓이를 구하는 메소드를 정의하고 호출하시오.
	public static void areaOfCircle(int r) {
		double areaOfCircle = 3.14* r/2;
		System.out.println(Math.PI);
	}
	//실습 : sum이라는 메소드를 시작하는 숫자도 정할 수 있도록 수정하시오\public
	public static void sum(int start, int end) {
		int total = 0;
		for(int i = start; i <= end; i++) {
			total += i;
	  }
		System.out.println(total);
	}
	
	public static void lengthOfCircle(int r) {
		double length = 2 * 3.14 * r;
		System.out.printf("반지름 %d의 둘레길이는 %f/n",r ,length);
	}
	
	public static void power(int a, int b) {
		int origin = a;
		for(int i = 0 ; i < b - 1; i++) {
			a = origin * a;
		}
		System.out.println(a);
	}
	
	

}