package com.inc.example;

public class AssignmentEx1 {

	public static void main(String[] args) {
		//대입 연산자 (<-)
		//variable = data
		
		String msg="java is fum";
		
		int num1=10;
		int num2=num1=5;
		System.out.println(num2);
		
		//복합 대입 연산자(<-);
		//+=, -=, /=, *=, %=
		System.out.println(num1);
		
		//num1 = num1+1;
		num1 += 1;
		System.out.println(num1);
		
		//num2 = num2-3;
		num2 -= 3;
		System.out.println(num2);
		
		num1 *= 5;
		System.out.println(num1);
		
		//실습 - 다음 출력 결과를 예상해 보세요
		int x=10;
		x%=2.5;
		System.out.println(x); //0
		

	}

}
