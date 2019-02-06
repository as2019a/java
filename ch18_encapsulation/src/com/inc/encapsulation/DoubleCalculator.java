package com.inc.encapsulation;

import java.util.Scanner;

public class DoubleCalculator {
	private char operatior;
	private double memory1;
	private double memory2;
	private char operator;
	private static final Scanner scanner = new Scanner(System.in);
	private static Object result = null;
	
	private void init() {
		System.out.println("연산의 종류를 입력해주세요");
		operator = scanner.nextLine().charAt(0);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		memory1 = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요");
		memory2 = scanner.nextDouble();
		scanner.nextLine();	
	}
	
	private double sum() {
		return memory1 + memory2;
	}
	
	private double sub() {
		return memory1 - memory2;
	}
	
	private void print() {
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
