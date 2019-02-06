package com.inc.coop.v2;

public interface IOperator {
	//interface안에서 선언한 추상 메서드의 접근제한자는 무조건 public
	//public 
	double sum(double a, double b);
	double sub(double a, double b);
	double mul(double a, double b);
	double div(double a, double b);
}
