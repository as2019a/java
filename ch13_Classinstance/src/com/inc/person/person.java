package com.inc.person;

public class person {
	//실습 1 : 사람의 이름, 직업, 나이를 저장할 수 있는 세개의 멤버 변수를 선언하시오.
	public String name;
	public String job;
	public int age;
	
	//실습 2 : 해당 사람의 정보를 출력해주는 getInfo라는 메서드를 선언하시오.
	public void getinfo() {
		System.out.printf("이름 : %s, 직업 : %s, 나이 : %d\n", name, job, age);
	}
	
}
