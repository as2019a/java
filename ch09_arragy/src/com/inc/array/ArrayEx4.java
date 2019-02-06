package com.inc.array;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] twos = {2, 4, 8, 16};
		int[] threes = {3, 9, 27, 81, 243};
		int[][] numbers = {twos, threes};
		//int[][] numbers = {{2, 4, 6, 8},{3, 9, 27, 81, 243}};
		
		System.out.println(twos);
		System.out.println(numbers[0]);
		System.out.println(twos == numbers[0]);
		System.out.println(numbers[1][4]);
		
		//실습 : 8, 9 ,81을 위와 같이 출력해보시오
		System.out.println(numbers[0][2]);
		System.out.println(numbers[1][1]);
		System.out.println(numbers[1][3]);
		
		//이중반복문 + 2차원배열
		for(int i =0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%4d",numbers[i][j]);
			}
			System.out.println();
		}
		
		char[][] chars = {{'A','B','C'},{'a','b','c','d'},{'0','1'}};
		//for 출력
		for(int i =0; i < chars.length; i++) {
			for(int j = 0; j < chars[i].length; j++) {
				System.out.printf("%4c",chars[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
