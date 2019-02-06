package com.inc.assignment;

public class ChallengeEx1 {
	
	public static void main(String[] args) {
		int[] numbers = {4,9,3,1,5,0,2,8,6,7};
		
		//위의 배열에 들어있는 숫자들을
		//오름차순으로 정렬하시오.
		//선택정렬
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int copy = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = copy;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("%4d",numbers[i]);
		}
		
	}
}
