package com.inc.example;

public class ArithmelticEx2 {

	public static void main(String[] args) {
		//산술연산자 (->)
		//+  : num1 + num2, str1 + str2, str + num
		//-  : num1 - num2
		//*  : num1 * num2
		// / : num1 / num2
		// % : 나머지(modular)
		
		//산술연산의 경우 좌항과 우항의 자료형이 다르다면
		//둘 중 자료형의 범위가 작은 것을 범위가 더 큰 자료형으로 캐스팅 한 후 연산
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		System.out.println(10.0/(double)3);
		
		System.out.println(10%3);
		System.out.println(5%1.5);
		
		int a=9;
		System.out.println(a%2);
		
		int b=10;
		System.out.println(b%2);
		
		//*, /. %가 +, - 보다 연산순위가 높다
		System.out.println(10-5*2+3);
		
		//실습 : 출력결과를 예측해 보세요.(hint : 결합방향 ->)
		System.out.println(3+2%1.5*4-2); //3.0
		System.out.println(6/2+10%2-3*2); //-3
		System.out.println(1+3*2-(4-2)%3/2); //6

	}

}
