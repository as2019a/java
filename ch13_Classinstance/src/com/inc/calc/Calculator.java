package com.inc.calc;

import java.util.Scanner;

public class Calculator {
	
	final double pi = 3.14;
	double memory1;
	double memory2;
	Scanner scanner = new Scanner(System.in);
	
	void add() {
		System.out.println(memory1 + memory2);
	}
	
	void sub() {
		System.out.println(memory1 - memory2);

	}
	
	// 실습 : 곱하기(mul)와 나누기(div)를 추가하시오.
	
	void mul() {
		System.out.println(memory1 * memory2);
	
	}
	
	void div() {
		System.out.println(memory1 / memory2);
	
	}
	
	//실습 : IengthOfCircle, aeraOfCircle (반지름 = memory1)
	void IengthOfCircle() {
		System.out.println(2*pi*memory1);
	}
	
	void aeraOfCircle() {
		System.out.println(pi*memory1*memory2);
	}
	
	void prontInfo() {
		System.out.println("연산의 종류를  입력해 주세요");
		System.out.println("+.더하기");
		System.out.println("-.빼기");
		System.out.println("*.곱하기");
		System.out.println("/.나누기");
		System.out.println("@.원의 둘레");
		System.out.println("#.원의 넓이");
		System.out.println("x.종료");
	}
	
	void run() {
		while(true) {
			char choice = getChoice();
			if(choice == 'x') {
				return;
			}
			operate(choice);
		}
	}
	
	void operate(char choice) {
		switch(choice) {
		case '+' : add(); break;
		case '-' : sub(); break;
		case '*' : mul(); break;
		case '/' : div(); break;
		case '@' : IengthOfCircle(); break;
		case '#' : aeraOfCircle(); break;
		}
	}
	
	char getChoice() {
		prontInfo();
		char choice = scanner.nextLine().charAt(0);
		if(choice == '#' || choice == '@') {
			System.out.println("반지름을 입력해주세요");
			memory1 = scanner.nextDouble();
			scanner.nextLine();
		}else if(choice == '+' || choice == '-' || choice == '*' || choice == '/') {
			System.out.println("첫번째 숫자를 입력해 주세요");
			memory1 = scanner.nextDouble();
			System.out.println("두번째 숫자를 입력해 주세요");
			memory2 = scanner.nextDouble();
			scanner.nextLine();
		}
		return choice;
		
	}
	
}
