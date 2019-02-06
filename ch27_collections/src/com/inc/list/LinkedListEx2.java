package com.inc.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

	public static void main(String[] args) {
		List<Integer> odds = new LinkedList<>();
		odds.add(1);
		odds.add(3);
		odds.add(5);
		odds.add(7);
		odds.add(9);
		
		List<Integer> oddsArrayList = new ArrayList<>(odds);
		
		System.out.println(odds);
		System.out.println(oddsArrayList);
		
	}

}
