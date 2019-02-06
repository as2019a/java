package com.inc.components3;

import java.util.Scanner;

public class NewProgams2 {
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		int year;
		System.out.println("연도를 입력하시오>>");
		year = sin.nextInt(); // 연도 입력
		if (year%4==0 && year%100!=0 || year%400==0) // 4로 나눌 떨어지고 100으로 나누어 떨어지지 않거나
												     // 400으로 나누어 떨어지는 경우
			System.out.println("윤년입니다");
		else
			System.out.println("평년입니다");
	}
}
