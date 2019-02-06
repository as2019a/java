package com.inc.person.v3;

public class PersonTest {

	public static void main(String[] args) {
		Person<String> p = new Person<String>("홍길동", "male");
		System.out.println(p);
		
		Person<Character> p2 = new Person<Character>("홍길동", 'm');
		System.out.println(p2);
		
		//generic타입으로 Object받는 p3를 생성하고 gender는 생성
		//generic타입을 생략하면(Object를 넣지않아도) Object로 인식
		Person<Object> p3 = new Person<Object>("홍길동", false); 
		System.out.println(p3);
		
		//generic타입으로 Boolean을 받는 p4를 생성
		Person<Boolean> p4 = new Person<Boolean>("홍길동", true);
		System.out.println(p4);
		
	}

}
