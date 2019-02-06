package com.inc.example;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 50, "도적");
		/*p1.name = "홍길동";
		p1.age = 50;
		p1.job = "도적";*/
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2 = new Person("***", 100);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person("도적");
		System.out.println(p3.job);

	}

}
