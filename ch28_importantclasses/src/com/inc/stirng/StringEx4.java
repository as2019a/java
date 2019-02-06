package com.inc.stirng;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		String fruit = "apple banana coconut";
		System.out.println(fruit.indexOf('p'));
		System.out.println(fruit.lastIndexOf('p'));
		System.out.println(fruit.indexOf(' '));
		System.out.println(fruit.indexOf("banana"));
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(fruit.indexOf(input) != -1);
		System.out.println("아이디를 입력해주세요");
		String id = scanner.nextLine();	
		//id에 공백이 있으면
		  if(id.indexOf(' ') != -1) {
			  System.out.println("공백은 입력할 수 없습니다.");
		  }
	}
}
