package com.inc.singleton;

public class SingleTest {
	
	public static void main(String[] args) {
		//Single s1 = new Single();
		//Single s2 = new Single();
		//System.out.println(s1 == s2);
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2);
	}
}
