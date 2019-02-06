package com.inc.person.v3;

public class Person<T> {
	private String name;
	private T gender;
	
	
	//파라미터 두개짜리 생성자
	public Person(String name, T gender) {
		//super();
		this.name = name;
		this.gender = gender;
	}


	@Override
	public String toString() {
		//return super.toString();
		return "이름 : " + name + ", 성별 : " + gender; 
	}
	
	
	
}
