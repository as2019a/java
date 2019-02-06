package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//과제 6개의 번호를 저장할 수 있는 balls라는 배열이있다.
		int[] balls = {45, 20, 14, 2, 32, 0};
		
		//사용자로부터 숫자를 입력받아 
		//balls의 6번째 숫자(5번 인덱스)에 저장하세요.
		
		//만약 이미 저장되어있는 숫자를 입력했다면
		//"이미 입력된 숫자입니다."
		//새로운 숫자를 입력했다면.
		//"입력이 완료되었습니다."를 출력하세요.
		
		//스캐너는 받아주는 소스코드
		Scanner scanner = new Scanner(System.in);
		//System.out.println("숫자를 입력해 주세요"); 은 명령 소스코드 입니다
		System.out.println("숫자를 입력해 주세요");
		int number = scanner.nextInt();
		int c = 0;
		
		for(int i=0; i < balls.length; i++) {
			if(balls[i]==number) {
				c = 1;
				break;
			}
		}
		
		if(c==1) {
			System.out.println("이미 입력된 숫자 입니다.");
		}
		else {
			balls[5]=number;
			System.out.println("입력이 완료되었습니다.");
		}
		for(int i = 0;i < balls.length;i++) {
			System.out.printf("%d\t",balls[i]);
		}

	}
}
