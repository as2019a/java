package com.inc.libraryVSapi;

public class Calculator {
	public void calc(double a, double b, char op) {
		switch(op) {
		  case '+' : sum(a, b); break;
		  case '-' : sub(a, b); break;
		  case '*' : mul(a, b); break;
		  case '/' : div(a, b); break;
		}
	}
	
	private void sum(double a, double b) {
		System.out.println(a + b);
	}
	private void sub(double a, double b) {
		System.out.println(a - b);
	}
	private void mul(double a, double b) {
		System.out.println(a * b);
	}
	private void div(double a, double b) {
		System.out.println(a / b);
	}
}
