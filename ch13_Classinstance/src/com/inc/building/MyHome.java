package com.inc.building;

public class MyHome {

	public static void main(String[] args) {
		Building MyHome = new Building();
		MyHome.name = "우성아파트";
		//seokcheon를 나이를 20으로 설정하시오
		MyHome.year = 34;
		
		System.out.println(MyHome.name);
		System.out.println(MyHome.year);
		
		MyHome.name = "Woo Sung Apartment";
		MyHome.year = 34;
		MyHome.in();
		MyHome.in();
		MyHome.getinfo();
		
		System.out.println(MyHome.name);
		System.out.println(MyHome.year);
		
		MyHome.getinfo();
		
		//실습 myHome이라는 변수를 선언하고 객체를 생성하시오.(위)
		//적절한 이름과 연식을 저장하고 getinfo();메서드를 호출하시오.
		

	}

}
