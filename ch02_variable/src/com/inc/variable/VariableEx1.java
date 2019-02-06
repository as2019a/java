package com.inc.variable;

public class VariableEx1 {

	public static void main(String[] args) {
		//실 습
		//10을 출력한다.
		//위에서 출력한 값에 3을 곱해서 출력한다.(*3)
		//위에서 출력한 값에 2를 나누어서 출력한다.(\2)
		
		System.out.println(10);
		//1,000줄
		System.out.println(10*3);
		//1,000줄
		System.out.println(30/2);
		
		
		System.out.println("------------");
		
		//정수를 저장할 수 있는 변수 선언
		int number;
		//System.out.println(number);
		
		//초기화 : 변수에 처음으로 값을 저장
		number = 10;
		System.out.println(number);
		//1,000줄
		number = number * 3;
		System.out.println(number);
		//1,000줄
		number = number / 2;
		System.out.println(number);
		
		
	}

}
