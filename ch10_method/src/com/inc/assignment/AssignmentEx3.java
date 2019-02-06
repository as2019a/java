package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx3 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 두개의 정수를 입력받는다.
		//2.큰 수의 제곱에서 작은 수의 제곱을 뺀 결과를 리턴하는
		//  메소드를 정의한다.
		//3.사용자로부터 입력받은 두개의 정수로 방금만든 메소드를 호출한다.
		//ex) 
		//(입력)
		//  10, 20
		//(출력)
		//  300
		
		//hint1 : 파라미터 int, int
		//hint2 : 리턴 int
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력해 주세요");
		int a = scanner.nextInt();
		
		System.out.println("두 번째 숫자를 입력해 주세요");
		int b = scanner.nextInt();
		int result = sub(a, b);
		System.out.println(result);
	}

	private static int sub(int a, int b) {
		if(a > b) {
			return a * a - b * b;
		}else {
			return b * b - a * a;
		}
		
	}
	
	//여기서 sub() 선언
	
	
	
	
	
	
	
	
	
	
	
	
	
}
