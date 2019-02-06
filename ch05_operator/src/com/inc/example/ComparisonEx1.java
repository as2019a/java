package com.inc.example;

public class ComparisonEx1 {

	public static void main(String[] args) {
		// 비교연산자 (->)
		// > : 크다
		// < : 작다
		// >= : 크거나 작다
 		// <= : 작거나 작다
		// == : 같다
		// != : 같지 않다
		
		int age=15;
		boolean isAdult=age>=20;
		System.out.println(isAdult);
		
		boolean is20=age==20;
		System.out.println(is20);
		
		System.out.println(age==15);
		
		boolean not15=age!=15;
		System.out.println(not15);
		
		System.out.println(true!=true);
		System.out.println('A'==(char)65);
		
		//실습 : 다음 결과를 예측해 보세요
		System.out.println(age==15==true); //true
		System.out.println(age==20==true); //false
		System.out.println(age>=15==age<20); //true
		
	}

}
