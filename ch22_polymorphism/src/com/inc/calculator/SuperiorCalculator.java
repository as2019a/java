package com.inc.calculator;

public class SuperiorCalculator extends DivideCalculator{
	double mul() {
		return memory1 * memory2;
	}
	
	double lengthOfCircle() {
		return 2 * Math.PI * memory1;
	}
	
	double areaOfCircle() {
		return Math.PI * memory1 * memory2;
	}
	
	void SetMemory(double radius) {
		this.memory1 = radius;
	}
	
	//overriding, 오버라이딩 : 부모가 물려준 메서드를 재정의(덮어쓰기)
	void SetMemory(double memory1, double memory2) {
		this.memory1 = memory1;
		this.memory2 = memory2;
	}
	
}
