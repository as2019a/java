package com.inc.stirng;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String phoneNumber = "010-6401-5113";
		
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 8));
		System.out.println(phoneNumber.substring(0, 3));
		System.out.println(phoneNumber.substring(9, 13));
		String phone = "02-1234-5678";
		System.out.println(phone.substring(0, phone.indexOf('-')));
		//실습 : 폰에 가운데 번호 출력하시오
		System.out.println(phone.substring(3, 7)); //가운데 번호 출력 : "1234" - 방법 1
		System.out.println(phone.substring(phone.indexOf('-')+1, phone.lastIndexOf('-'))); //가운데 번호 출력 : "1234" - 방법 2
		

	}

}
