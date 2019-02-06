package com.inc.example;

public class IncrementDerementEx2 {

	public static void main(String[] args) {
		//증감연산자 결합방향(<-)
		//++var : 전위증가연산자
		//var++ : 후위증가연산자
		//--var : 전위감소연산자
		//var-- : 후위감소연산자
		
		int a=0;
		int b=++a;
		System.out.println(a);
		System.out.println(b);
		
		a=0;
		int c=a++;
		System.out.println(a);
		System.out.println(c);
		
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(a--);
		
		//int b=++a;
		//a=a+1;
		//int tmp=a;
		//int b=tmp;
		
		//int c=a++;
    //int tmp=a;
		//int a=a+1;
		//int c=tmp;
			
		
	}

}
