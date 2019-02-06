package com.inc.assignment;

import java.util.Scanner;

public class ChallengeEx2 {
	public static void main(String[] args) {
		//세 자리 이하의 정수를 차례로 입력 받다가 
		//999가 입력되면 프로그램을 종료하고 
		//그 때까지 입력된 최대값과 최소값을 출력하는 
		//프로그램을 작성하시오.
		//ex)입력: 1, 3, 100, 50, 500, 200, 999
		//   출력: 최댓값 : 500, 최솟값 : 1
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		int min = 1000;
		while(true) {
			System.out.println("다음 숫자를 입력해 주세요");
			int input = scanner.nextInt();
			if(input == 999) {
				break;
			}
			if(input > max) {
				max = input;
			}
			
			if(input < min) {
				min = input;
			}
		}
		
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
		
	}
}





