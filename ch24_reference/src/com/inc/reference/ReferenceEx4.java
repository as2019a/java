package com.inc.reference;

public class ReferenceEx4 {
	
	public static void main(String[] args) {
		String str = "Hello";
		changer(str);
		System.out.println(str);
	}
	
	private static void changer(String s) {
		s = "Hi";
	}
	
}
