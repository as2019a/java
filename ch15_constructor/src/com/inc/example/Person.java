package com.inc.example;

public class Person {
	//2.외부로 부터 데이터를 받아서 사용해야되는 경우
	String name;
	int age;
	String job;
	
	//생성자가 아무것도 없으면 JVM이 기본생성자가 자동으로 만들어주지만
	//생성자가 하나라도 있으면 만들어 주지 않는다.
	public Person(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
		//this(name.age);
		System.out.println(name);
	}
	
	//실습 - 파라미터가 String(name), int(age)인 생성자를 추가하시오
	public Person(String name, int age) {
		this.name = name; //오버로딩의 개념 - 중복 특징
		this.age = age;
	}
	public Person(String job) {
		this.job = job;

	}
}
