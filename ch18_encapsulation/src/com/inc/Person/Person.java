package com.inc.Person;

public class Person {
	/*public String name;
	public int age;
	public String job;*/
	
	private String name;
	private int age;
	private String job;
	
	//getter method
	public String getName() {
		return name + "님";
	}
	
	public void setName(String name) {
		//if()
		this.name = name + "님";
	}
	
	//실습 : age, job에 대한 getter메서드를 정의하시오
	public int getAge() {
		return age;
	}
	
	//age-setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJob() {
		return job;
	}
	
	//job-setter
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
