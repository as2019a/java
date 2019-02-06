package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx4 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 세개의 과목에 해당하는 점수(정수)를 차례로 입력받는다.
		//2.정수 세개를 파라미터로 받아 총점을 리턴하는 함수를 정의한다.
		//3.방금 만든 메소드들을 사용하여 총점과 평균을 얻어낸 뒤 출력한다.
		//ex) 
		//(입력)
		//    100 80 90
		//(출력)
		//    총점 : 270
		//    평균 : 90
		
		//hint
		//총점을 구하는 함수
		//리턴 : int
		
		//평균을 구하는 함수
		//리턴 : double
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 점수를 입력해 주세요.");
		int a = scanner.nextInt();
		
		System.out.println("두 번째 점수를 입력해 주세요.");
		int b = scanner.nextInt();
		
		System.out.println("세 번째 점수를 입력해 주세요.");
		int c = scanner.nextInt();
		
		System.out.println(total(a, b, c));
		System.out.println(average(a, b, c));
		
	}

	private static int total(int a, int b, int c) {
	 return a + b + c;
	}
  private static int average(int a, int b, int c) {
	 return (a + b + c)/3;
	}
 
	//여기에서 total()선언
	
	//여기에서 average()선언
	
	
	
	
	
	
	
	
	
	
}
