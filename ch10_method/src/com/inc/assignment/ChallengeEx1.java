package com.inc.assignment;

import java.util.Scanner;

public class ChallengeEx1 {
	public static void main(String[] args) {
		//도전
		//1.사용자로부터 정수 n을 입력받는다.
		//2.n개의정수를 저장할 수 있는 배열을 선언한다.
		//3.위에서 선언한 배열에 사용자로부터 n개의 정수를 입력받는다.
		//4.배열을 내림차순으로 정렬하는 함수를 정의한다.
		//5.위에서 선언한 함수를 이용해서 배열을 내림차순으로 정렬한다. 
		//ex)
		//(입력)
		//5
		//12 35 1 48 9
		//(출력)
		//48 35 12 9 1
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%d번째 숫자를 입력해 주세요", i+1);
			numbers[i] = scanner.nextInt();
		}
		
		//정렬 알고리즘
		
		
	}
}
