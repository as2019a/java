package com.inc.stirng;

import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String email = null;
		while(true) {
			System.out.println("이메일을 입력해주세요");
		     email = scanner.nextLine();
		     //@ .이 들었다면 break;
		     //if : &&(and) ||(or) , x && y, x || y
		     //@ .
		     if(email.indexOf('@') != -1 && email.indexOf('.') != -1) {
			     break;
		     }
		     System.out.println("@ 또는 .이 빠졌습니다.");
		}

	}

}
