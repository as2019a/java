package com.inc.reference;

public class ReferenceEx6 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(20);
		
		changer(p);
		
		System.out.println(p.getAge());
	}
	
	private static void changer(Person person) {
		person.setAge(100);
	}
	//대문자는 클래스를 의미하는 것이고
	//소문자는 변수를 의미하는 것이다.
	
}
