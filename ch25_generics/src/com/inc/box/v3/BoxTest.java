package com.inc.box.v3;

import com.inc.person.v1.Person;

public class BoxTest {

	public static void main(String[] args) {
		Box<Person> personBox = new Box<Person>(10);
		personBox.add(new Person("홍길동", "male"));
		System.out.println(personBox.get(0));
		
		//StringBox를 선언하고 우리반 학생의 이름 3명의 이름을 담아보세요
		Box<String> stringBox = new Box<>(3);
		stringBox.add("A");
		stringBox.add("B");
		stringBox.add("C");
		
		//StringBox의 모든 요소를 출력하시오(for)
		for(int i = 0; i < stringBox.size(); i++) {
			System.out.println(stringBox.get(i));
		}
	}
}
