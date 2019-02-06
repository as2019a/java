package com.inc.example;

public class ArithmeltcEx1 {

	public static void main(String[] args) {
		//산술연산자 (->)
		//+  : num1 + num2, str1 + str2, str + num
		//-  : num1 - num2
		//*  : num1 * num2
		// / : num1 / num2
		// % : 나머지(modular)
		
		//더하기
		System.out.println(1+1);
		
		int a=10, b=20;
		System.out.println(a+b);
		
		String str1="welcome to";
		String str2="Programming world";
		System.out.println(str1+str2);
		System.out.println(str1+" "+str2);
		
		//문자와 숫자를 연산하게 되면 숫자가 문자열로 형변환이 된다.
		System.out.println(str1+a);
		System.out.println("10"+a);
		
		//결합방향 ->
		System.out.println(10+20+"30");
		System.out.println(10+"20"+30);
		System.out.println("10"+20+30);
		

	}

}
