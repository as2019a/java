package com.inc.assignment;

import java.util.Scanner;

public class Assignment2 {
	String[] answers = new String[5];
	// 과제 : 당직 사다리프로그램을 작성하세요.
	// 설명 : 다섯명의 이름을 입력하면 랜덤하게
	// 요일을 출력해주는 프로그램을만들어 보세요.
	// 단, 메서드, 변수 선언시 클래스 vs 인스턴스 결정
	// ex)
	// 이름을 차례대로 입력해주세요.
	// 입력:박태환
	// 출력:수
	// 입력:김연아
	// 출력:목
	// 입력:손연재
	// 출력:월
	// 입력:이상화
	// 출력:금
	// 입력:서장훈
	// 출력:화
	
	Scanner scanner = new Scanner(System.in);
	
	void run() {
	
		String[] day = {"월","화","수","목","금"};
		int[] random = new int[5]; //04213
		for(int i = 0; i < answers.length; i++) {
		//0 ~ 4 랜덤한 숫자(요일)
		int randomDay = (int)(Math.random() * 5);
		random[i] = randomDay;
		}
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("이름을 입력하세요");
			String name = scanner.nextLine();
			System.out.println(day[random[i]]);
		}
		
	}
	
	
	
	
	
		
	
	
	
}
