package com.inc.calc.v4;

public class GraphingCalculator extends Calculator{
	//Overriding
	/*private static final double PI = 3.141592;
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
	}*/
	
	private void graphing() {
		System.out.println("그래픽 생성중...");
	}
	
	@Override
	public void view() {
		graphing();
		System.out.printf("+++ %f +++\n", result);
	}
	
}
