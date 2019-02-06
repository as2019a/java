package com.inc.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetEx1 {

	public static void main(String[] args) {
		Set<String> trainee = new LinkedHashSet<>();

		trainee.add("태연");
		trainee.add("서현");
		trainee.add("소연");
		trainee.add("수영");
		trainee.add("효연");
		trainee.add("윤아");
		trainee.add("김도연");
		trainee.add("최유정");
		
		System.out.println(trainee);
		
		Set<Integer> numbers = new LinkedHashSet<>();
		
		numbers.add(32);
		numbers.add(2);
		numbers.add(45);
		numbers.add(700);
		System.out.println(numbers);
	}

}
