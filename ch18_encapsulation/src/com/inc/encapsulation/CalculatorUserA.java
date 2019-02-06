package com.inc.encapsulation;

public class CalculatorUserA {

	public static void main(String[] args) {
		//올바른 사용자
		/*intCalculator iCalc = new intCalculator();
		iCalc.run();*/
		
		DoubleCalculator dCalc = new DoubleCalculator();
		dCalc.run();
	}
}
