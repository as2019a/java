package com.inc.smartphone;

import java.util.Scanner;

public class SmartPhone {
	Calculator calculator = new Calculator();
	Diary diary = new Diary();
	Phone phone = new Phone();
	Scanner scanner = new Scanner(System.in);
	
	void run() {
		while(true) {
			int choice = showInfo();
			switch(choice) {
			case 0 : System.out.println("스마트폰 종료");
			         return;
			case 1 : calculator.run(); break;
			case 2 : diary.run(); break;
			case 3 : phone.call(); break;
			default : System.out.println("잘못된 입력입니다");
			}
		}
	}
	
	int showInfo( ) { 
		System.out.println("어떤 기능을 이용하시겠습니까?");
		System.out.println("0.종료");
		System.out.println("1.계산기");
		System.out.println("2.다이어리");
		System.out.println("3.전화");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone();
		smartphone.run();
	}
	
}

