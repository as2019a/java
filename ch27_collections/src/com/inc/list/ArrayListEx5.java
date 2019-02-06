package com.inc.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx5 {

	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		seats.add("박태환");
		seats.add("김연아");
		seats.add("손연재");
		
		System.out.println(seats.indexOf("박태환") != -1);
		System.out.println(seats.indexOf("서장훈") != -1);
		System.out.println(seats.contains("손연재"));
		System.out.println(seats.contains("심석희"));

	}

}
