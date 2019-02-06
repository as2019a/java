package com.inc.ifstatement;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("나이를 입력해주세요");	
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		
		//여러줄 주석
		/*if(age>=20) {
			System.out.println("관람 가능합니다");
	  }
	
	  if(age<20) {
		 System.out.println("관람 불가합니다");
		}*/
		
		if(age>=20) {
			System.out.println("관람 가능합니다");
		}else{
			System.out.println("관람 불가합니다");
		}
		
		System.out.println("성별을 입력해 주세요");
		scanner = new Scanner(System.in);
		char gender = scanner.nextLine().charAt(0);
		//System.out.println(gender);
		//실습 gender이 '남'이면 "멋지세요"
		//   gender이 '여'이면 "아름다우세요"
		if(gender == '남') {
			System.out.println("멋지세요");
		}
		if(gender == '여') {
			System.out.println("아름다우세요");
	 }
	/*if(gender == '남') {
				System.out.println("멋지세요");
		}else {
				System.out.println("아름다우세요");
		}*/
	}
}
