package com.inc.calc.v1;

public class ScientificCalculator {
	private static final double PI = 3.141592;
	private int left, right, radius;
	private double result;
	
	public void setOperand(int radius) {
		this.radius = radius;
	}
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;

	}
	
	public void sum() {
		result = left + right;
	}
	
	public void sub() {
		result = left - right;
	}
	
	public void root() {
		result = Math.sqrt(radius);
	}
	
	public void view() {
		System.out.printf("결과 : %f\n", result);
	}
	
}
