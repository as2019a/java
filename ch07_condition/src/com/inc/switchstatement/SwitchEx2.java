package com.inc.switchstatement;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		//break의 응용
		//어떤 헬스장의 사은품은 다음과 같다.
		//1개월 : X
		//2개월 : 락커룸
		//3개월 : +헬스복
		//4개월 : +러닝화
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("등록 개월수를 입력해주세요");
		int month=scanner.nextInt();
		
		switch(month) {
			case 1 : System.out.println("없음"); break;
			case 4 : System.out.println("러닝화"); 
			case 3 : System.out.println("헬스복"); 
			case 2 : System.out.println("락커룸"); break;
			default : System.out.println("?");

	  }
		System.out.println("-------------------------------------");
		System.out.println("월을 입력해주세요");
		int month2=scanner.nextInt();
		switch(month2) {
			case 2 : System.out.println("28일");
			case 4 : case 6 : case 9 :
			case 11 : System.out.println("30일"); break;
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :
			case 12 : System.out.println("31일"); break;
			default : System.out.println("?");
		}
	}
}
