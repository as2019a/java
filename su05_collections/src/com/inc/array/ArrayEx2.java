package com.inc.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int number = scanner.nextInt();
		
		/*for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == number) {
				System.out.println("존재합니다");
				break;
			}
		}*/
		//foreach
		for(int n : numbers) {
			if(n == number) {
				System.out.println("존재합니다");
				break;
			}
			
		}
		
		scanner.close();
	}
}
