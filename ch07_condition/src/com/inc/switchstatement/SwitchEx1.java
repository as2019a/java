package com.inc.switchstatement;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
		char grade=scanner.nextLine().charAt(0);
		
		//switch는 조건식(true/false)이 아닌 비교할 값(숫자)
		switch(grade) {
			case 'A' : System.out.println("100~91"); break;
			case 'B' : System.out.println("90~81"); break;
			case 'C' : System.out.println("80~71"); break;
			default : System.out.println("내년에 또뵈요~!");
		}
		
		//실습 : 학년을 입력하면 담당교사를 출력하는 프로그램을 작성하시오.
		//1:임지혜, 2:홍지혜, 3:이지혜, 4:이은혜, 5:장혜진, 6:이혜란
		scanner = new Scanner(System.in);
		System.out.println("학년을 입력해주세요");
		int level = scanner.nextInt();
		switch(level) {
			case 1 : System.out.println("임지혜"); break;
			case 2 : System.out.println("홍지혜"); break;
			case 3 : System.out.println("이지혜"); break;
			case 4 : System.out.println("이은혜"); break;
			case 5 : System.out.println("장혜진"); break;
			case 6 : System.out.println("이혜란"); break;
			default : System.out.println("1~6 사이의 값을 입력하시오");
		}
	}

}
