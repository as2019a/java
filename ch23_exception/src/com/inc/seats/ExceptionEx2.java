package com.inc.seats;

import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {
		String[] seats = {"박태환","김연아","손연재","윤성빈"};
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 입력해주세요(A~O)");
			char alphabet = scanner.nextLine().charAt(0);
			if(alphabet < 'A' || alphabet > 'D') {
				System.out.println("잘못된 좌석입니다 : " + alphabet);
				continue;
			}
			System.out.println(seats[alphabet-65] + "님 입니다.");
			//코드로 예외를 막는것은 문제가 있다
			//1.코드가 많아질 우려가 있다.
			//2.예외에 대한 책임을 분산시킬수 없다.
		}
		
	}
}
