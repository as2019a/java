package com.inc.box.v2;

import com.inc.person.v1.Person;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box(10);
		box.add(new Person("홍길동", "male"));
		box.add("임꺽정");
		box.add(100);
		
		//Object로 선언시 첫번째 문제
		//모든 클래스를 전부 다 담을 수 있다
		
		
		//두번째 문제
		//꺼내왔을 때 담긴 요소가 어떤 클래스인지 외워야 한다
		String str = (String)box.get(0);
		System.out.println(str);
	}

}
