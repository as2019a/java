package som.inc.loop;

import java.util.Scanner;

public class ContinueEx1 {

	public static void main(String[] args) {
		for(int day = 1; day <= 31; day++) {
			if(Math.random() < 0.2) {
				continue;
			}
			System.out.println("학원에 갑니다."+day);
		}
		
		Scanner scanner = new Scanner(System.in);
		for(;true;) {
			System.out.println("다음 분~!");
			System.out.println("최근에 수술한 적이 있나요?(y/n)");
			char answer = scanner.nextLine().charAt(0);
			if(answer == 'y') {
				continue;	
			}
				
			System.out.println("최근에 중동여행을 다녀오신적이 있나요?(y/n)");
			answer = scanner.nextLine().charAt(0);
			if(answer == 'y') {
				continue;	
			}
			
			System.out.println("혈액형을 알려주세요");
			String bloodType = scanner.nextLine();
			System.out.printf("헌혈을 시작합니다. (%S형)", bloodType);
		}
		
		
	}

}
