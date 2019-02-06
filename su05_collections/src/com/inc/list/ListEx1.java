package com.inc.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		//int[] numberArray = new int[4];
		List<Integer> numberList = new ArrayList<Integer>();
		//numberArray[0] = 0;
		numberList.add(0);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		int zero = numberList.get(0);
		int one = numberList.get(1);
		
		List objectList = new LinkedList<>();
		objectList.add(0);
		objectList.add('1');
		objectList.add("2");
		int[] array = {3};
		objectList.add(array);
		
		String two = (String)objectList.get(2);
		int[] three = (int[])objectList.get(3);
		System.out.println(two);
		System.out.println(three);
		System.out.println(three[00]);
		
		objectList.set(2, "Two");
		System.out.println(objectList.get(2));
		
		for(int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}
		numberList.remove(0);
		for(int number : numberList) {
			System.out.println(number);
		}
		
		
	}

}
