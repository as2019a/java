package com.inc.assign;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		//과제1
		//월을 입력하면 계절을 출력하세요
		//봄 : 3 ~ 5
		//여름 : 6 ~ 8
		//가을 : 9 ~ 11
		//겨울 : 12 ~ 2
		
		//switch버전, if버전 두가지로 해보세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요");
		int month1 = scanner.nextInt();
		switch(month1) {
			case 3 : case 4 : case 5 : System.out.println("봄"); break;
			case 6 : case 7 : case 8 : System.out.println("여름"); break;
			case 9 : case 10 : case 11 : System.out.println("가을"); break;
			case 12 : case 1 : case 2 : System.out.println("겨울"); break;
		}
		
		
		System.out.println("월을 입력해주세요");
		int month = scanner.nextInt();
		if(month>2 && month<=5) {
			System.out.println("봄");
		}else if(month>5 && month<=8) {
			System.out.println("여름");
		}else if(month>8 && month<=11){
			System.out.println("가을");
		}else if(month == 12 || month == 1 || month == 2){
			System.out.println("겨울"); 
		}else{
			System.out.println("");
		}
	}
}
