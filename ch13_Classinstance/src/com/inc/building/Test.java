package com.inc.building;

import com.inc.person.person;

public class Test {

	public static void main(String[] args) {
		Building seokcheon = new Building();
		seokcheon.name = "석천빌딩";
		//seokcheon를 나이를 20으로 설정하시오
		seokcheon.year = 20;
		
		System.out.println(seokcheon.name);
		System.out.println(seokcheon.year);
		
		seokcheon.name = "seokcheon";
		seokcheon.year = 10;
		seokcheon.in();
		seokcheon.in();
		seokcheon.getinfo();
		
		System.out.println(seokcheon.name);
		System.out.println(seokcheon.year);
		
		seokcheon.getinfo();
		
		//실습 myHome이라는 변수를 선언하고 객체를 생성하시오
		//적절한 이름과 연식을 저장하고 getinfo();메서드를 호출하시오.
		
		System.out.println("--------------------------------------");
		
		person me = new person();
		me.name = "이영섭";
		me.job = "job hunter";
		me.age = 29;
		me.getinfo();
		

	}

}
