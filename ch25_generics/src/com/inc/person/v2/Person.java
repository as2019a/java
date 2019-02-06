package com.inc.person.v2;

public class Person {
	private String name;
	private Object gender;
	
	
	//파라미터 두개짜리 생성자
	public Person(String name, Object gender) {
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
