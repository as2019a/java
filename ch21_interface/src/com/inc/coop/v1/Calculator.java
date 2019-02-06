package com.inc.coop.v1;

import java.util.Scanner;

public class Calculator {
	private Operator operator = new Operator();
	private static final Scanner scanner = new Scanner(System.in);
	
	public void run() {
		while(true) {
			int choice = printInfo();
			if(choice == 0) {
				return;
			}else if(choice > 5 || choice < 1) {
				System.out.println("잘못된 선택입니다");
				continue;
			}
			
			trun(choice);
		}
	}
	
	private void trun(int choice) {
		System.out.println("첫 번째 숫자를 입력해주세요");
		double a = scanner.nextDouble();
		System.out.println("두 번째 숫자를 입력해주세요");
		double b = scanner.nextDouble();
		switch(choice) {
		case 1 : System.out.println(operator.sum(a,  b)); break;
		case 2 : System.out.println(operator.sub(a,  b)); break;
		case 3 : System.out.println(operator.mul(a,  b)); break;
		case 4 : System.out.println(operator.div(a,  b)); break;
		}
	}

	private int printInfo() {
		System.out.println("기능을 입력해주세요");
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈");
		System.out.println("0.종료");
		int choice = scanner.nextInt();
		scanner.nextLine();
		return choice;
	}
}
