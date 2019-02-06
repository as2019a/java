package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx2 {
	public static void main(String[] args) {
		//과제
		//1.사용자로부터 100이하의 자연수를 입력받는다.
		//2.아래와 같은 사각형을 출력하는 메서드를 작성하고 호출하시오.
		//ex)
		//(입력)
		//   3
		//(출력)
		//   1 2 3
		//   2 4 6
		//   3 6 9
		//(입력)
		//   4
		//(출력)
		//   1 2 3 4
		//   2 4 6 8
		//   3 6 9 12
		//   4 8 12 16
		
		//hint1 : 파라미터는 int
		//hint2 : return은 void
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int number = scanner.nextInt();
		
		rectangle(number);
		
	}

		private static void rectangle(int number) {
			for(int i = 1; i < number+1; i++) {
				for(int j = 1; j < number+1; j++) {
					System.out.printf("%d\t",i * j);
				}
				System.out.println();
	 }
  }
	
 }





