package com.inc.assignment;

public class ChallengeEx3 {
	public static void main(String[] args) {
		//도전3 : 원 형태의 별을 찍어보세요(마름모 아님)
		//단! 자간보다 행간이 커서 타원형태의 별이 찍힐것입니다.
		//    *
		//  *****
		// *******
		// *******
		//*********
		// *******
		// *******
		//  *****
		//    *
		
		//반지름이 5인 원을 그래프로 그려보면 X^2 + Y^2 = 25
		for(int x = -5; x <= 5; x++) {
			for(int y = -5; y <= 5; y++) {
				if(x*x + y*y <= 25) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
