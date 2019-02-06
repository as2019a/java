package com.inc.object;

public class Car {
	int maxSpeed;
	int price;
	String model;
	
	public void start() {
		System.out.println("부르릉~!");
	}
	
	@Override
	public String toString() {
		return String.format("최대속도 : %d, 가격 : %d, 모델명 : %s", maxSpeed, price, model);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.maxSpeed = 200;
		myCar.price = 1000000;
		myCar.model = "BMW M3";
		
		myCar.start();
		System.out.println(myCar.toString());
	}
	
	//User라는 클래스를 정의하시오.
}
