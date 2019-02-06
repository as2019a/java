package com.inc.assign;

import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		//과제2
		//정수 a, b를 받아서 (a > b) 
		//b가 a의 약수이면 "약수입니다."
		//아니면 "약수가 아닙니다"를 출력하는
		//프로그램을 작성하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해주세요");
		int a = scanner.nextInt();
		System.out.println("두 번째 정수를 입력해주세요");
		int b = scanner.nextInt();
		
		if(a%b==0) {
			System.out.println("약수입니다");
		}else {
			System.out.println("약수가 아닙니다");
		}
	}
}
