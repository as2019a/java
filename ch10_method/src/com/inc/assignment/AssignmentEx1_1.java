package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx1_1 {

	//main이라는 메서드는 세 가지 역할을 하고 있었다.
	//역할1 : 사용자로부터 숫자를 입력받는다.
	//역할2 : 돈을 확인하여 라면을 끓이거나 돈을 돌려준다.
	//역할3 : 돌려받은 결과물(result)를 출력한다.
	
	//문제점
	//1. main메서드가 복잡해진다
	//2. 역할2를 여러번 재활용하면 중복코드가 발생하고 유지보수가 어려워진다.

	public static void main(String[] args) {
		//역할1
		Scanner scanner = new Scanner(System.in);
		System.out.println("돈을 넣어주세요");
		int money = scanner.nextInt();
		
		//역할2
		String result = "";
		if(money == 1000) {
			System.out.println("라면을 조리중입니다.");
			result = "맛있는 라면";
			
		}else{
			System.out.println("자판기 : 돈이 정확하지 않습니다.");
			result = money+"";
		}
		
		//역할3
		System.out.println(result);
		scanner.close();
	}
	
	
}
