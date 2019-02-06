package com.inc.upanddown;

import java.util.Scanner;

public class UpAndDownEx3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("up&down을 시작합니다.");
		System.out.println("1 ~ 100중에 선택해주세요");
		int choice = scanner.nextInt();
		int win = 55;
		
		while(choice != 0) {
			if(choice == win) {
				System.out.println("축하합니다.");
			}else if(choice > win) {
				System.out.println("더 작아요.");
			}else {
				System.out.println("더 큽니다.");
			}
			System.out.println("종료하시려면 0을 입력해 주세요.");
			choice = scanner.nextInt();
		}
		
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}
	
}
