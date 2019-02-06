package som.inc.loop;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력할 단을 입력해 주세요");
		int dan = scanner.nextInt();
		
		for(int i = 1;i <= 9;i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan * i);
		}
		
		System.out.println("-------------------------------------");
		
		for(int k = 2;k <=9;k++) {
			for(int j = 1;j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",k, j, k * j);
			}
			System.out.println();
		}
	}

}
