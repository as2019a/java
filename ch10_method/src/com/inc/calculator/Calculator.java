package com.inc.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요");
		int first = Integer.parseInt(scanner.nextLine());
		System.out.println("연산 기호를 입력해 주세요(+, -, *, /, ^)");
		char operator = scanner.nextLine().charAt(0);
		int second = Integer.parseInt(scanner.nextLine());
		
		calc(first, operator, second);
	}
	
	public static void calc(int first, char op, int second) {
		switch(op) {
		  case '+' : System.out.println(first + second); break;
		  case '-' : System.out.println(first - second); break;
		  case '*' : System.out.println(first * second); break;
		  case '/' : System.out.println(first / second); break;
		  case '^' : System.out.println(power(first, second)); break;
		  default : System.out.println("올바르지 않은 기호입니다");
		}
	}

	public static double power(int a, int b) {
		int result = 1;
		for(int i = 0; i < b; i++) {
			result = result * a;
		}
		return result;
		
	}
}
