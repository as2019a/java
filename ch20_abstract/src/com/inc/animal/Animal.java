package com.inc.animal;

//추상메서드를 하나라도 가지고 있는 클래스는 abstract라는 키워드를 추가
public  abstract class Animal {
	  //공통적인 변수
    String name;
  	int age;
  	
  	//공통적인 메서드
  	void eat() {
  		System.out.println("얌얌");
  	}
  	
  	void move() {
  		System.out.println("거느적 거느적");
  	}
  	
  	//구현부(body {})가 없는 메서드는 추상메서드이소 abstract라는 키워드 추가
  	//추상클래스를 상속받는 클래스는 추상메서드를 오버라이딩 해야만 한다.
  	abstract void crying();
}
