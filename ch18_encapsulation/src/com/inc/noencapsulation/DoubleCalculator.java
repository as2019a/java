package com.inc.noencapsulation;

import java.util.Scanner;

public class DoubleCalculator {
	public char operatior;
	public double memory1;
	public double memory2;
	private char operator;
	public static final Scanner scanner = new Scanner(System.in);
	private static Object result = null;
	
	public void init() {
		System.out.println("연산의 종류를 입력해주세요");
		operator = scanner.nextLine().charAt(0);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		memory1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요");
		memory2 = scanner.nextDouble();
		scanner.nextLine();	
	}
	
	public double sum() {
		return memory1 + memory2;
	}
	
	public double sub() {
		return memory1 - memory2;
	}
	
	public void print() {
		System.out.printf("결과 : %f\n", result);
	}
	
	public void run() {
		init();
		
		if(operator == '+') {
			result = sum();
		}else if(operator == '-') {
			result = sub();
		}else {
			System.out.println("잘못된 입력입니다.\n프로그램을 종료합니다");
			return;
		}
		
		print();
	}
}
