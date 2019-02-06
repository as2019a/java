package com.inc.stirng;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());

		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		if (id.length() < 5 || id.length() > 13) {
			System.out.println("6글자 이상 12글자 이하로 입력해주세요");
		}else {
			System.out.println("적절한 아이디 입니다");
		}

		for (int i = 0; i < id.length(); i++) {
			System.out.println(id.charAt(i));
		}

		// 실습
		String input = scanner.nextLine();
		//실습 : 사용자로부터 입력받은 문자중 가장 마지막 문자를 출력하시오.
		System.out.println(input.charAt(input.length()-1));
		
	}

}
