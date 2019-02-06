package com.inc.exmple;

import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		String name=scanner.nextLine();
		System.out.println(name+"님 안녕하세요?");

	}

}
