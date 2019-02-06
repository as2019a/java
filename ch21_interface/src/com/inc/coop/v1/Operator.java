package com.inc.coop.v1;

import java.util.Scanner;

public class Operator {
	private Scanner scanner = new Scanner(System.in);
	
	private double input() {
		System.out.println("숫자를 입력해주세요");
		return scanner.nextDouble();
	}
	
	public double sum() {
		return input() + input();
	}
	public double sub() {
		return input() - input();
	}
	public double mul() {
		return input() * input();
	}
	public double div() {
		return input() / input();
	}
}
