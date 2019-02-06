package com.inc.ifstatement;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성별을 입력해주세요?");
		char gender = scanner.nextLine().charAt(0);
		
		/*if(gender == '남') {
			System.out.println("멋지세요");
		}
		if(gender == '여') {
			System.out.println("아름다우세요");
	  }
		if(gender!='남'&&gender!='여');
		System.out.println("누구세요?");

	  }*/
		
		if(gender=='남') {
			System.out.println("멋지세요");
		}else if(gender=='여') {
			System.out.println("아름다우세요");
		}else {
			System.out.println("누구세요?");
		}
		
		System.out.println("성적을 입력해주세요");
		char grade=scanner.nextLine().charAt(0);
		if(grade=='A') {
			System.out.println("100~91");
		}else if(grade=='B') {
			System.out.println("90~81");
		}else if(grade=='c'){
			System.out.println("80~71");
		}else {
			System.out.println("내년에 또뵈요");
		}
		System.out.println("------------------------");
		scanner = new Scanner(System.in);
		System.out.println("성적을 입력해주세요");
		int score = scanner.nextInt();
		
		if(score>=91) {
			System.out.println("A");
		}else if(grade>=81) {
			System.out.println("B");
		}else if(grade>=71) {
			System.out.println("C");
	  }else {
		  System.out.println("F");
	  }
	}
}
