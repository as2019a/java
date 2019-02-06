package com.inc.array;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numbers = {5712,6511,6512,6513,6514,6515};
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int copy = numbers[j];
					numbers[j] = numbers[j];
					numbers[j] = copy;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%2d\t",numbers[i]);
		}
	}

}
