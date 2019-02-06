package com.inc.example;

public class IncrementDerementEx1 {

	public static void main(String[] args) {
		//증감연산자 결합방향(<-)
		//++var : 전위증가연산자
		//var++ : 후위증가연산자
		//--var : 전위감소연산자
		//var-- : 후위감소연산자
		
		int a=0;
		System.out.println(a);
		
		//a=a+1
		//a += 1;
		++a;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		--a;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
	}

}
