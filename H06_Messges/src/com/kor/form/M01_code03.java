package com.kor.form;

import java.util.Scanner;

public class M01_code03 {

	public static void main(String[] args) {
		// 		
		Scanner scanner = new Scanner(System.in);
		int Number = 10;
		Short Age = 0;
		char GradeOfEnglish = 'S';
		
		System.out.printf("Number : %d\n",Number);
		System.out.printf("Age : %d\n",Age);
		System.out.printf("GradeOfEnglish : %d\n",GradeOfEnglish);
		
		System.out.printf("\n");
		
		Number = Number + 20;
		Age = 32;
		GradeOfEnglish = 'K';
		
		System.out.printf("Number : %d\n",Number);
		System.out.printf("Age : %d\n",Age);
		System.out.printf("GradeOfEnglish : %d\n",GradeOfEnglish);
	}
}
