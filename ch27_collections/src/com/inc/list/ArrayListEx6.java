package com.inc.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx6 {

	public static void main(String[] args) {
		List<List<String>> persons = new ArrayList<>();
		
		List<String> stars = new ArrayList<>();
		stars.add("박태환");
		stars.add("김연아");
		stars.add("손연재");
		
		List<String> singers = new ArrayList<>();
		singers.add("NS윤지");
		singers.add("윤아");
		singers.add("손나은");
		
		persons.add(stars);
		persons.add(singers);
		
		for(List<String> list : persons) {
			for(String name : list) {
				System.out.println(name);
			}
		}
		

	}

}
