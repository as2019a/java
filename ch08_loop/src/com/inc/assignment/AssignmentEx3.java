package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx3 {
	public static void main(String[] args) {
		//1부터 100까지의 정수 중 한 개를 입력받아
		//100 보다 작은 배수(들을 차례로 출력하다가
		//10의 배수가 출력되면 프로그램을 종료하도록 
		//프로그램을 작성하시오
		//ex) 입력 = 4
		//    출력 = 4 8 12 16 20
		//    입력 = 3
		//    출력 = 3 6 9 ... 27 30
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
	
		int number = scanner.nextInt();
		int mul= 1;
		
		while(true) {
			System.out.printf("%d  ", number*mul);
			mul++;
			if((number*mul)%10==0) {
				System.out.printf("%d  ", number*mul);
				break;
			}
	 }
		
		
	}
}
