package com.inc.baseball;

import java.util.Scanner;

public class BaseBallEx02 {
	public static void main(String[] args) {
		//1.컴퓨터가 랜덤한 숫자 3개를 정해서 배열에 담는다
		int[] answers = getRandomNumbers();
		
		while(true) {
			int[] predicts = getPredicts();
			
			int strike = compareArrays(answers, predicts);
			
			if(strike == 3) {
				System.out.println("축하합니다.");
				return;
			}
		}
	}
	
	public static int[] getRandomNumbers() {
		int[] answers = new int[3];
		for(int i = 0; i < answers.length; i++) {
			//1 ~ 9 랜덤한 숫자
			int randomNumber = (int)(Math.random() * 9) + 1;
			answers[i] = randomNumber;
			//중복검사
			for(int j = 0; j < i; j++) {
				if(answers[j] == randomNumber) {
					i--;
					break;
				}
			}
		}
		
		return answers;
	}
	
	public static int[] getPredicts() {
		//2.사용자로부터 중복되지 않은 숫자 3개 받기
		Scanner scanner = new Scanner(System.in);
		int[] predicts = new int[3];
		for(int i = 0; i < predicts.length; i++) {
			System.out.printf("%d번째 숫자를 입력해 주세요\n", i+1);
			predicts[i] = scanner.nextInt();
			//중복제거
			for(int j = 0; j < i; j++) {
				if(predicts[i] == predicts[j]) {
					System.out.printf(
							"중복된 숫자는 입력할 수 없습니다. (%d번째숫자)\n",j+1);
					i--;
					break;
				}
			}
		}
		return predicts;
	} 

	public static int compareArrays(int[] answers, int[] predicts) {
	  //3.정답과 입력을 비교한다.
		int ball = 0;
		int strike = 0;
		for(int i = 0; i < answers.length; i++) {
			for(int j = 0; j < predicts.length; j++) {
				if(answers[i] == predicts[j]) {
					if(i != j) {
						ball++;
					}else {
						strike++;
					}
				}
			}
		}
		System.out.printf("ball:%d, strike:%d\n", ball, strike);
		return strike;
	}
}

