package com.inc.array;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		//리터럴 방식
		String[] singers = {"윤종신", "윤아", "김동률", "아이유"};
		System.out.println(singers[3]);
		singers[3] = "김윤아";
		System.out.println(singers[3]);
		
		//객체생성 방식
		String[] stars = new String[5];
		System.out.println(stars[0]);
		stars[0] = "박태환";
		System.out.println(stars[0]);
		
		int[] numbers = new int[10];
		Scanner scanner = new Scanner(System.in); 
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요\n", i + 1);
			numbers[i] = scanner.nextInt();
		}
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[1] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
			//System.out.printf("%4d",numbers[i]);
		}
		System.out.printf("홀수 %d, 짝수 %d", odd, even);
		
		

	}

}
