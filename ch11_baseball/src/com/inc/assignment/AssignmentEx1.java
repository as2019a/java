package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx1 {

	public static void main(String[] args) {
		//선택1 UpAndDown이라는 게임을 만들어 본 뒤 정답과 비교해 보세요.
		//선택2 UpAndDown이라는 게임을 분석 후 만들어 보세요.
		
		//컴퓨터 난수 발생
		int su = (int)(Math.random() * 100) + 1;
		
		//사용자 입력
		Scanner scanner = new Scanner(System.in);
		int input;
		
		//게임 인트로 메세지 출력
		System.out.println("<<<< Up & Down >>>>");
		System.out.println();
		
		//맞출수 있는 기회
		int cnt = 10;
		
		//사용자 입력 무제한
		while(cnt > 0) {
			System.out.println("입력 >> ");
			input = scanner.nextInt();
			if(input <= 0 || input > 100) {
				System.out.println("입력 범위는 1 ~ 100입니다. 다시 입력해주세요");
				continue;
			}
			if(su == input) {
				System.out.println("Wow Fantatic Baby ~ : 맞췄습니다.");	
				break;
			}
			else if(su > input){
				System.out.println("Up Up Up !!! 더 큰 수를 입력하세요.");
		  }
			else {
		  	System.out.println("Down Down~ 더 작은 수를 입력하세요.");
		  }
			
			cnt--;
		}
		if(cnt <= 0) {
			System.out.println("10번 안에 문제를 맞추지 못하다니... 당신은 문제를 인식하는 인지능력이 부족합니다..." 
			+ "정답은" + su + "입니다.");
		}
	 }
  
}
