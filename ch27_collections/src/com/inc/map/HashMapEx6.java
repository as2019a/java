package com.inc.map;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapEx6 {

	public static void main(String[] args) {
		List<String> stars = new ArrayList<>();
		stars.add("박태환");
		stars.add("김연아");
		stars.add("손연재");

		List<String> singers = new ArrayList<>();
		singers.add("윤아");
		singers.add("제시카");
		singers.add("유연정");

		Map<String, List<String>> persons = new HashMap<>();
		persons.put("stars", stars);
		persons.put("singers", singers);
		
		System.out.println(persons.get("stars").get(2));
		System.out.println(persons.get("singers").get(2));
		System.out.println("--------------------------------");
		/*for (List a : persons.values()) {
			for (String name : a) {
				System.out.println(name);
			}
		}*/
		for (String key : persons.keySet()) {
			for (String name : persons.get(key)) {
				System.out.println(name);
			}
		}
		
	}
}
