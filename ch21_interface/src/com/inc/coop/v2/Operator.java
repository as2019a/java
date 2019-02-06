package com.inc.coop.v2;

import java.util.Scanner;

public class Operator implements IOperator{
	private Scanner scanner = new Scanner(System.in);
	
	/*private double input() {
		System.out.println("숫자를 입력해주세요");
		return scanner.nextDouble();
	}*/
	
	public double sum(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double mul(double a, double b) {
		return a * b;
	}
	public double div(double a, double b) {
		return a / b;
	}
}
