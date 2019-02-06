package com.inc.example;

public class MethodEx07 {

	public static void main(String[] args) {
		int result = sum(3);
		System.out.println(result);
		System.out.println(sum(10));
		System.out.println(sum(1, 5));
		
		System.out.println(lengthOfCircle(10));
		System.out.println(areaOfCircle(10));
	}
	
	public static int sum(int end) {
		int total = 0;
		for(int i = 1; i <= end; i++) {
			total += i;
		}
		return total;
	}
	
	public static String sum(int stert, int end) {
			int total = 0;
			for(int i = 1; i <= end; i++) {
				total += i;
	 }
			
		return "결과는" + total + "입니다";
	}
	
	//반지름을 파라미터로 받아서
	//원의 둘레를 리턴하는 lenghtOfCircle이라는 함수와
	//원의 넓이를 리턴하는 areaOfCircle이라는 함수를 정의하고 호출하시오
	
	public static double lengthOfCircle(int r) {
		double length = Math.PI * r;
		return length;
	}
		
	public static double areaOfCircle(int r) {
		double area = Math.PI * power(r, 2);
		return area;
	}
	
	public static int power(int a, int b) {
		int orgin = a;
		for(int i = 0; i < b - 1; i++) {
			a = orgin = a;
		}
		return a;
	}
	

 
}