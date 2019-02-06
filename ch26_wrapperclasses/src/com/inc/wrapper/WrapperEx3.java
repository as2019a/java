package com.inc.wrapper;

public class WrapperEx3 {

	public static void main(String[] args) {
		Person<String> p1 = new Person<>();
		p1.setName("철수");
		p1.setAge("ten");
		
		Person<Integer> p2 = new Person<>();
		p2.setName("민수");
		p2.setAge(10);
		//Object obj = 3;

	}

}
