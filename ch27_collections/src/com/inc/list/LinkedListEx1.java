package com.inc.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {

	public static void main(String[] args) {
		List<Integer> odds = new LinkedList<>();
		odds.add(1);
		odds.add(3);
		odds.add(5);
		odds.add(7);
		odds.add(9);
		
		//foreach를 써서 odds안에 있는 모든 홀수를 출력하시오
		for(int odd : odds) {
			System.out.println(odd);
		}
		
		odds.remove(1);
		for(int odd : odds) {
			System.out.println(odd);
		}
		
	}

}
