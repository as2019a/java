package com.inc.upanddown;

import java.util.Scanner;

public class UpAndDownEx6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("up&down을 시작합니다.");
		System.out.println("1 ~ 100중에 선택해주세요");
		int choice = scanner.nextInt();
		//변수가 필요한 이유
		int score = 10;
		//답이 정해져있으면 사용자는 게임을 두번이상 플레이하지 않을 것이다.
		//Math.random()이라는 코드는 항상 0~0.99999의 숫자를 반환해준다.
		int win = (int)(Math.random()*100) + 1;
		
		while(choice != 0) {
			if(choice == win) {
				System.out.println("축하합니다.");
				break;
			}else if(choice > win) {
				System.out.println("더 작아요.");
			}else {
				System.out.println("더 큽니다.");
			}
			score--;
			System.out.println("종료하시려면 0을 입력해 주세요.");
			choice = scanner.nextInt();
		}
		
		System.out.println("프로그램을 종료합니다. 점수 : "+score);
		scanner.close();

	}
	
}
