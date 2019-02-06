package com.inc.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> fruits = new HashMap<>();
		
		fruits.put("apple", "Apple is a red fruit.");
		fruits.put("banana", "Banana is yellow fruit.");
		fruits.put("banana", "Banana is delicious.");
		System.out.println(fruits);
		System.out.println(fruits.get("apple"));
		System.out.println(fruits.get("Apple"));
		fruits.remove("apple");
		System.out.println(fruits.get("apple"));
	}
}
