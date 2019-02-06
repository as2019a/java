package com.inc.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		//bc.memory1 = 10;
		//bc.memory1 = 20;
		bc.SetMemory(10, 20);
		System.out.println(bc.sum());
		System.out.println(bc.sub());
		
		//방법
		//1.BasicCalculator에 mul이라는 새로운 메서드를 추가
		//2.MultiplyCalculator에 mul이라는 새로운 클래스를 만들고
		//  BasicCalculator
		MultiplyCalculator mc = new MultiplyCalculator();
		mc.SetMemory(5, 7);
		System.out.println(mc.sum());
		System.out.println(mc.mul());
		
		//실습1
		//DivideCalculator를 만드시오 단, BasicCalculator를 상속할 것
		//div(나누기)메서드를 추가
		DivideCalculator hc = new DivideCalculator();
		hc.SetMemory(10, 2);
		System.out.println(hc.div());
		
		
		//실습2
		//SuperiorCalculator를 만드시오 단, DivideCalculator를 상속할 것
		//mul(곱하기), lengthOfCircle, areaOfCircle메서드를 추가
		SuperiorCalculator lc = new SuperiorCalculator();
		lc.SetMemory(5, 12);
		System.out.println(lc.mul());
	  lc.SetMemory(7);
		System.out.println(lc.areaOfCircle());
		
		

	}

}
