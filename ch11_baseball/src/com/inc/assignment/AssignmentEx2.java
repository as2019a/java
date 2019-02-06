package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx2 {

	public static void main(String[] args) {
		//간단한 게임 or 프로그램을 구상해서 구현해보세요.
		//ex)묵찌빠
		
		//가위바위보 게임 -> 컴퓨터(난수 발생)와 인간(키보드 입력)의 가위바위보 게임
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			//AI가 발생하는 가위바위보를 얻어와 저장 
			// => 1: 가위 2: 바위 3: 보 
			int com = (int)(Math.random() * 10) % 3 + 1; // 1-3범위의 난수 발생
			
			//키보드로 가위바위보를 입력 받아 저장
			int intput;
			while(true) {
				System.out.println("입력[1:가위,2:바위,3:보] >>");
				//아래 소스코드는 가위, 바위, 보 문자로 입력할시에는 에러가 발생, 에러발생하지않으려면 1, 2, 3 숫자로 입력하여 AI와 3번 대결
				intput = scanner.nextInt();
				if(intput >= 1 && intput <= 3) break;
				System.out.println("가위, 바위, 보 중 하나만 선택해주세요");
			}
			
			System.out.println();
			
			if(com == 1) System.out.println("AI : 가위");
			else if(com ==2)System.out.println("AI : 바위");
			else System.out.println("AI : 보");
			
			if(intput == 1) System.out.println("사람 : 가위");
			else if(intput ==2)System.out.println("사람 : 바위");
			else System.out.println("사람 : 보");
			
			System.out.println("<<결과>>");
			if(com == intput) {
				System.out.println("비김");
			} else if(com==1 && intput==2 && com==2 || intput==3 || com==3 && intput==1) {
				System.out.println("사람 Win");
			} else {
				System.out.println("AI Win");
			}
			System.out.println("================================");
		}
		scanner.close();
	}

}
