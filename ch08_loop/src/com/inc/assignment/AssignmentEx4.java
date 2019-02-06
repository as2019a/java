package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//10개의 정수를 입력받아 입력받은 수들 중 
		//짝수의 개수와 홀수의 개수를 각각 구하여 
		//출력하는 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		
		int f = 0;
		int g = 0;
		for(int i=0; i<10; i++) {
			System.out.println("숫자를 입력해 주세요");
			int number = scanner.nextInt();
			if(number%2==0) {
			 f = f+1;
			}else {
				g = g+1;
			}
		}
		System.out.printf("홀수 : %d", "짝수 : %d", f, g);
		
	}
}

