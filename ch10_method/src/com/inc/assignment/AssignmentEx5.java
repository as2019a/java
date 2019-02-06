package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx5 {
	private static Object numbers;

	public static void main(String[] args) {
		// 과제
		// 1.사용자로부터 다섯개의 정수를 입력 받아 배열에 저장한다.
		// 2.정수를 입력받으면 절대값을 리턴하는 메소드를 정의한다.
		// 3.방금 만든 메소드를 사용하여 사용자가 입력한 5개의 숫자의
		// 절대값을 출력한다.
		// ex)
		// (입력)
		// -10 15 -2 10 -100
		// (출력)
		// 10 15 2 10 100
		// hint1 : 파라미터 int
		// hint2 : 리턴 int
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("5개 정수를 입력해주세요");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		abs(numbers);

		for (int num : numbers) {
			System.out.printf("%d\t", num);
		}
	}

	public static int[] abs(int[] number) {

		for (int i = 0; i < number.length; i++) {
			if (number[i] < 0) {
				number[i] = -(number[i]);
			}
		}
		return number;

	}
	// 여기에 abs()선언

}

