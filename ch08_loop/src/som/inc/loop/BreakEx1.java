package som.inc.loop;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {
			int number = (int)(Math.random() * 6) + 1;
			System.out.println(number);
			if(number == 6) {
				System.out.println("당첨입니다.");
				//반복을 그 즉시 탈출
				break;
			}
			System.out.println("꽝입니다.");
		}
		
		System.out.println("----------------------------");
		Scanner scanner = new Scanner(System.in);
		
		for(;true;) {
			String input = scanner.nextLine();
			if(input.equals("x")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println(input);
		}
		
	}

}
