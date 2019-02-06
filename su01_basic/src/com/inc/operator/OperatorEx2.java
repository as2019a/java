package com.inc.operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		int b = 10;
		b%= 5;
		b = b % 5;
		b &= b;
		b = 10 % 10;
		System.out.println(b);

	}

}
