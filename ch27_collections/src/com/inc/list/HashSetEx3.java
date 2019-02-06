package com.inc.list;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class HashSetEx3 {

	public static void main(String[] args) {
		Set<Integer> balls = new HashSet<>();
			
		while(balls.size() != 6) {
			int ball = (int)(Math.random() * 45) + 1;
			balls.add(ball);
		}
		
		System.out.println(balls);
		
		Set<Integer> userBalls = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		//사용자로 부터 중복되지 않은 6개의 숫자(1~45)를 입력하시오
		/*System.out.print("로또번호 추출 개수 입력: ");
    int gameCnt = scanner.nextInt();

    for (int i = 1; i <= gameCnt; i++) {
        System.out.println(
                i + "번째 로또번호: " + balls.size());
    }*/
		for(int count = 0;userBalls.size() < 6;) {
			System.out.printf("%d번째 숫자를 입력해주세요\n", count +1);
			try {
			int number = scanner.nextInt();
			if(userBalls.contains(number)) {
				System.out.println("중복된 숫자 입니다");
				continue;
			}
			userBalls.add(number);
			count++;
			}catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다");
				scanner = new Scanner(System.in);
			}
			System.out.println(userBalls);
			
			userBalls.retainAll(balls);
			System.out.println("맞춘 번호 : " + balls);
			System.out.println("등수 : " + (7 - userBalls.size()));
		}

	}

}
