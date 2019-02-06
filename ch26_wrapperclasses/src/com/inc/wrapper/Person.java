package com.inc.wrapper;

public class Person<T> {
	private String name;
	private T age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	
	
	
}
