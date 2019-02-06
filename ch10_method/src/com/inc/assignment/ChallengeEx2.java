package com.inc.assignment;

import java.util.Scanner;

public class ChallengeEx2 {
	public static void main(String[] args) {
		//과제
		//중복되지 않는 랜덤한 숫자 6개를 담고있는 배열을 반환(return)하는 함수를 정의하시오. 
		int[] balls = createBalls();
		for(int ball : balls) {
			System.out.println(ball);
		}
	}
	
	public static int[] createBalls() {
		Scanner scanner = new Scanner(System.in);
		int[] balls = new int[6];
		
		for(int i = 0 ; i < balls.length; i++) {
			balls[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(balls[i] == balls[j]) {
					i--;
					break;
 				}
			}
		}
		
		
		return balls;
	}
}
