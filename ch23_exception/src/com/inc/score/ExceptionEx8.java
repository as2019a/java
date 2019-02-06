package com.inc.score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx8 {
	public static void main(String[] args) {
		int[] scores = {80, 90, 100};
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("과목코드를 입력해 주세요");
			System.out.println("1.국어\n2.수학\n3.영어");
			int choice = 0;
			try {
				choice = scanner.nextInt();
				System.out.println("선택하신 과목의 점수는");
				System.out.println(scores[choice-1] + "점 입니다.");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("1 ~ 3이내의 숫자를 입력해주세요");
				System.out.println("입력한 코드 : "+choice);
			}catch(InputMismatchException e){
				//예외처리
				scanner = new Scanner(System.in);
				System.out.println("숫자만 입력해 주세요");
			}catch(Exception e) {
				//continue;
				System.out.println("알수없는 이유에 의해서 에러가 발생했습니다.");
				System.out.println("관리자에게 문의하세요");
			}
		}
	}
	//참고용도 코드
/*	try {
		System.out.println(scores[choice - 1] + "점 입니다.");
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("----------------------------------");
		System.out.println(e.getMessage());
		System.out.println("-----------------------------------");
		System.out.println("잘못된 배열인덱스에 접근했습니다 : "+e.getMessage());
}*/
}