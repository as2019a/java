package com.inc.assign;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		//과제3
		//년도를 입력하면 윤년인지 평년인지 판단하는 
		//프로그램을 작성하세요.
		
		//hint
		//규칙 1) 4로 나뉘어지 지면 윤년이다. 4, 8, 2016,
		//규칙 2) 규칙1을 만족하는 것중 100으로 나뉘어지면 평년이다. 100, 2100 
		//규칙 3) 규칙2을 만족하지만 400으로 나뉘어진다면 윤년이다. 2000
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력해주세요");
		int year = scanner.nextInt();
		
		if(year%400 == 0) {
			System.out.println("윤년");
		}else if(year%100 == 0) {
				System.out.println("평년");
			}else if(year%4 == 0) {
				System.out.println("윤년");
			}else {
				System.out.println("평년");
			}
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		}
	}
