package com.inc.heap;

public class Test {

	public static void main(String[] args) {
  	Building inc = new Building(); //지역 변수(inc), 인스턴트 변수 2개 할당
		System.out.println(inc.name);
		System.out.println(inc.year);
		inc.name = "석천빌딩";
		inc.year = 15;
		

	}

}
