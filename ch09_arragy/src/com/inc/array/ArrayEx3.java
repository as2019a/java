package com.inc.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		String[] sportsStars = {"박태환", "김연아", "손연재", "서장훈", "이동국"};
		String[] singers = {"윤종신", "윤하", "김동률"};
		
		//for each - 개선된 for 문
		for(String star : sportsStars) {
			System.out.println(star);
		}
		
		int[] numbers = {100, 200, 300, 400, 500};
		//실습 numbers에 포함된 숫자를 출력하시오(for each)
		for(int number : numbers) {
			System.out.println(number);
		}
		System.out.println("-----------------------------------");
		int[] dans = {2, 5, 8 ,9};
		//실습 위 dans라는 배열에 들어있는 단을 가지고 구구단을 출력하시오.
		//바깥 for문-foreach, 반복 for문 - 일반for
		for(int dan : dans) {
			for(int i = 1;i < 10;i++) {
				System.out.printf("%d x %d = %d\t", dan, i ,dan*i); 
				
			}
			System.out.println();
		}
	
	}
		
}
