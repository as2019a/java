package com.inc.array;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		String[] seats = {"박태환", "김연아", "손연재", "이상화",
				              "윤종신", "윤아", "김동률", "아이유"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("좌석을 입력해주세요");
		char alphabet = scanner.nextLine().charAt(0);
		System.out.printf("해당 좌석에는 %s님이 앉아 계십니다", seats[alphabet-65]);
	}

}
