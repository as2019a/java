package com.inc.score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx10 {
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
			}catch(Exception e) {
				System.out.println("제대로 입력해주세요");
				scanner = new Scanner(System.in);
				return;
			}finally {
				//무조건적으로 실행해야되는 코드(외부로 벝 빌려온 리소스 반납)
				//System.out.println("ok");
				scanner.close();
		  }
		}
	}
}
