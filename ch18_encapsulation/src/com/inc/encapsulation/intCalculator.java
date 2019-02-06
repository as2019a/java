package com.inc.encapsulation;

import java.util.Scanner;

public class intCalculator {
	private char operator;
	private int memory1;
	private int memory2;
	private int result;
	private static final Scanner scanner = new Scanner(System.in);
	
	private void init() {
		System.out.println("연산의 종류를 입력해주세요");
		operator = scanner.nextLine().charAt(0);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		memory1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("두 번째 숫자를 입력해 주세요");
		memory2 = scanner.nextInt();
		scanner.nextLine();	
	}
	
	private int sum() {
		return memory1 + memory2;
	}
	
	private int sub() {
		return memory1 - memory2;
	}
	
	private void print() {
		System.out.printf("결과 : %d\n", result);
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
