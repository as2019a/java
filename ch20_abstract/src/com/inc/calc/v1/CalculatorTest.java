package com.inc.calc.v1;

public class CalculatorTest {

	public static void main(String[] args) {
		ScientificCalculator sCalc = new ScientificCalculator();
		sCalc.setOperand(3);
		sCalc.root();
		sCalc.view();
		
		GraphingCalculator gCalc = new GraphingCalculator();
		gCalc.setOperand(20, 30);
		gCalc.sum();
		gCalc.view();
	}

}
