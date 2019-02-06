package com.inc.array;

import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[][] seats = new String[3][4];
		while (true) {
			System.out.println("어떤 열에 앉기를 희망하십니까?(1 ~ 3)");
			// 숫자형태의 문자열 -> 숫자
			int line = Integer.parseInt(scanner.nextLine()) - 1;

			if (line == 3) {
				break;
			}

			System.out.println("어떤 좌석에 앉기를 희망하십니까?(A ~ D)");
			int alphabet = scanner.nextLine().charAt(0) - 65;

			if (seats[line][alphabet] != null) {
				System.out.println("이미 예약한 좌석입니다.\n다른 좌석을 선택해주세요.\n");
				continue;
			}
		}
		
	// 실습 - 이름을 입력했을 때 그 사람의 좌석의 열번호와 알파벳을 출력하시오
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		out: for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (name.equals(seats[i][j])) {
					System.out.printf("&d열, %c석 입니다.", i + 1, j + 65);
					break out;
				}
			}
		}
	}

}
