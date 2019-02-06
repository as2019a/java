package com.inc.person.v4;

public class Person<T1,T2> {
	private T1 name;
	private T2 gender;
	
	
	//파라미터 두개짜리 생성자
	public Person(T1 name, T2 gender) {
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
