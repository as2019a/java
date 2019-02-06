package com.inc.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("박태환");
		System.out.println(seats.get(0));
		seats.add("김연아");
		seats.add("손연재");
		seats.add("윤성빈");

		for (int i = 0; i < seats.size(); i++) {
			System.out.println(seats.get(i));
		}

		seats.add(0, "심석희");
		System.out.println("------------------");
		for (int i = 0; i < seats.size(); i++) {
			System.out.println(seats.get(i));
		}

		// foreach
		for (String name : seats) {
			System.out.println(name);
		}

		seats.set(1, "최민정");
		print(seats);

		seats.remove(2);
		print(seats);
		
		//실습 : 가수들을 저장할 수 있는 ArrayList를 선언
		//가수 4명 추가
		//두번째 가수를 다른 가수로 변경, 출력
		//세번째 가수 삭제, 출력
		//두번째 가수를 다른 가수로 추가, 출력
		//모든 가수 삭제, 출력
		List<String> singers = new ArrayList<>();
		singers.add("보아");
		singers.add("태연");
		singers.add("윤아");
		singers.add("김도연");
		print(singers);
		System.out.println(singers.get(0));
		
		for (int i = 0; i < singers.size(); i++) {
			System.out.println(singers.get(i));
		}

		singers.add(0, "로시");
		System.out.println("------------------");
		for (int i = 0; i < singers.size(); i++) {
			System.out.println(singers.get(i));
		}

		// foreach
		for (String name : singers) {
			System.out.println(name);
		}

		singers.set(1, "박혜나");
		print(singers);

		singers.remove(2);
		print(singers);
		
		singers.set(2, "정선아");
		print(singers);
		
		singers.removeAll(singers);
		print(singers);

	}

	private static void print(List<String> list) {
		System.out.println("------------------");
		for (String name : list) {
			System.out.println(name);
		}
	}

}
