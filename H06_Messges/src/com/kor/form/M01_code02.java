package com.kor.form;

import java.util.Scanner;

public class M01_code02 {

	public static void main(String[] args) {
		// 3과목 점수 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력해 주세요.");
		int a = scanner.nextInt();
		
		System.out.println("수학 점수를 입력해 주세요.");
		int b = scanner.nextInt();
		
		System.out.println("영어 점수를 입력해 주세요.");
		int c = scanner.nextInt();
		
		System.out.println(total(a, b, c));
		System.out.println(average(a, b, c));
		
	}

	private static int total(int a, int b, int c) {
	 return a + b + c;
	}

  private static int average(int a, int b, int c) {
	 return (a + b + c)/3;
	}
}
