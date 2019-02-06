package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx5 {
	public static void main(String[] args) {
		//과제 6개의 번호를 저장할 수 있는 balls라는 배열이있다.
		int[] balls = new int[6];
		
		//사용자로부터 숫자를 입력받아 balls에 저장하고 저장이 끝나면
		//사용자가 입력한 숫자를 차례대로 출력하는 프로그램을 만들어 보세요
		//단, 중복을 허용하지 않기 때문에 이미 입력한 숫자를 다시 입력했다면
		//"이미 입력하신 숫자입니다"라고 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		//out : for(int i=0; i < balls.length; i++)
		out : for(int i=0; i < balls.length; i++) {
			
			System.out.printf("%d 입력:",i+1);
			int input = scanner.nextInt();
			
			for(int j=0; j<i; j++) {
				if(balls[j] == input) {
					System.out.println("이미 입력하신 숫자입니다.");
					break out;
				}
			}
			balls[i]=input;
		}
		
		//출력 결과
		for(int i=0; i<balls.length;i++) {
			System.out.printf("%d\t",balls[i]);
		}
		
	}
}
