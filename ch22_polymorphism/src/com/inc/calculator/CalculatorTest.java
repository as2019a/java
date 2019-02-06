package com.inc.calculator;

import javax.swing.DebugGraphics;

public class CalculatorTest {

	public static void main(String[] args) {
		//자식 인스턴스 -> 부모타입(암시적 형변환)
		//(Object)
		Object obj = new SuperiorCalculator();
		BasicCalculator bc = new SuperiorCalculator();
		DivideCalculator dc = new SuperiorCalculator();
		//상속받지 않은 클래스로 형변환 할 수 없다 //(MultiplyCalculato)
		//MultiplyCalculator mc = new SuperiorCalculator();
		SuperiorCalculator sc = new SuperiorCalculator();
		
		//부모인스턴스 -> 자식타입(형변환 불가능)
		/*SuperiorCalculator sc2 = (SuperiorCalculator)new DivideCalculator();
		sc2.areaOfCircle();*/
		
		//다시 원래 클래스로 형변환 할 수 있다.
		DivideCalculator dc2 = new DivideCalculator();
		BasicCalculator bc2 = (BasicCalculator)dc2;
		DivideCalculator dc3 = (DivideCalculator)bc2;
		dc3.SetMemory(10, 20);
		System.out.println(dc3.div());
		
	}

}
