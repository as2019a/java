package com.inc.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		seats.add("박태환");
		print(seats);
		System.out.println(seats.indexOf("박태환"));
		System.out.println(seats.indexOf("김연아"));
		System.out.println(seats.indexOf("김연이"));
		System.out.println(seats.lastIndexOf("박태환"));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("확인하고 싶은 사람의 이름을 입력하세요");
		String name = scanner.nextLine();
		if(seats.indexOf(name) != -1) {
			//System.out.println("존재합니다.");
			System.out.println((char)(seats.indexOf(name) + 65));
		}else {
			System.out.println("존재하지 않습니다.");
		}
		
		
	}
	
	private static void print(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("-----------------------------");
	}

}
