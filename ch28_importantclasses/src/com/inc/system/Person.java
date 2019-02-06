package com.inc.system;

public class Person {
	public int age;
	
	//생성자
	public Person(int age) {
		this.age = age;
		System.out.println("Person 메모리 적재됨"); //aws
	}
	
	//소멸자
	@Override
	public void finalize() {
		System.out.println("Person이 메모리에서 제거됨");
	}
	
}
