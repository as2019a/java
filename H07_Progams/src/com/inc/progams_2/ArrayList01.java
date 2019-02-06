package com.inc.progams_2;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("A");
		seats.add("B");
		seats.add("C");
		seats.add("D");
		seats.add("E");
		
		System.out.println(seats.get(1));
		
		for (int i = 0; i < seats.size(); i++) {
			System.out.println(seats.get(i));
		}

	}

}
