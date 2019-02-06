package com.inc.ladder;

import java.util.Scanner;

public class LadderGame {
	int[] days = new int[5];
	
	//Scanner에 경우에는 객체별로 다른 값을 가질 필요가 없기 때문에
	//클래스 변수로 선언하는게 효율적이다
	static Scanner scanner = new Scanner(System.in);
	
	
	void createDays() {
		//random한 day만들기
		for(int i = 0; i < days.length; i++) {
			days[i] = (int)(Math.random()*5);
			//중복검사
			for(int j = 0; j < i; j++) {
				if(days[j] == days[i]) {
					i--;
					break;
				}
			}
		}
	
	/*for(int day : days) {
		System.out.println(day);
	}*/
   	
 }
   	void run() {
		createDays();
		for(int day : days) {
			System.out.println("이름을 입력해 주세요");
			String name = scanner.nextLine();
			char charDay = intToDay(day);
			System.out.printf("%s : %c\n", name, charDay);
		}
		
   }
   	static char intToDay(int day) {
			switch(day) {
				case 0 : return '월';			
				case 1 : return '화';			
				case 2 : return '수';			
				case 3 : return '목';			
				case 4 : return '금';			
			}
			return 'X';
		}
		
   	public static void main(String[] args) {
   		LadderGame lg = new LadderGame();
   		lg.run();

 }
}
