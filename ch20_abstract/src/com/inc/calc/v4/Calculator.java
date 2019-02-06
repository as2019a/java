package com.inc.calc.v4;

public abstract class Calculator {
	//추상 메서드, view 추상 메서드
	//*private
	static final double PI = 3.141592;
	int left, right, radius;
	double result;
	
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
		
		public abstract void view(); //{}
			//System.out.println(result);
		
}
