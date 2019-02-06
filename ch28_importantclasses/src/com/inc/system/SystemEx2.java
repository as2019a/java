package com.inc.system;

public class SystemEx2 {

	public static void main(String[] args) {
		String str = "abcde";
		str = "ABCDE";
		//강제로 garbage collector를 실행
		System.gc();
		
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		p1 = null;
		p2 = null;
		System.gc();
	}
}
