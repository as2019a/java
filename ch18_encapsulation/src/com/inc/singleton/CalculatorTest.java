package com.inc.singleton;

public class CalculatorTest {
	
	public static void main(String[] args) {
		//Calculator s1 = new Calculator();
		//Calculator s2 = new Calculator();
		//System.out.println(s1 == s2);
		
		Calculator s1 = Calculator.getInstance();
		Calculator s2 = Calculator.getInstance();
		System.out.println(s1 == s2);
	}
}
