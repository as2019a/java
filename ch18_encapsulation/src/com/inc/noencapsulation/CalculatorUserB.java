package com.inc.noencapsulation;

public class CalculatorUserB {

	public static void main(String[] args) {
		//올바르지 못한 사용자
		/*intCalculator iCalc = new intCalculator();
		iCalc.memory1 = 10;
		iCalc.memory1 = 20;
		int result = iCalc.sum();
		System.out.println(result);*/
		
		DoubleCalculator dCalc = new DoubleCalculator();
		dCalc.memory1 = 10;
		dCalc.memory1 = 20;
		//int result = dCalc.sum();
		//System.out.println(result);
		
	}
}
