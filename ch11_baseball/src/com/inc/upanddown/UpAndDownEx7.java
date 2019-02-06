package com.inc.upanddown;

import java.util.Scanner;

public class UpAndDownEx7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("up&down을 시작합니다.");
		System.out.println("1 ~ 100중에 선택해주세요");
		//while을 썼을때는 사용자의 코드를 받아야지만 비교가
		//가능했기에 반복문 시작하기전, 반복문 안쪽에
		//사용자로부터 숫자를 받는 코드가 두번 있었다.
		//하지만 do while에서는 비교전에 실행이 가능하므로
		//한줄이면 족하다.
		int choice;
		int score = 10;
		int win = (int)(Math.random()*100) + 1;
		
		do{
			choice = scanner.nextInt();
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
			
		}while(choice != 0);
		
		System.out.println("프로그램을 종료합니다. 점수 : "+score);
		scanner.close();

	}
	
}
