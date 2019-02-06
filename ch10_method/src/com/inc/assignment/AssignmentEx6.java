package com.inc.assignment;

import java.util.Scanner;

public class AssignmentEx6 {
	//1.실수를 입력받아서 소숫점 이하 첫째자리에서 내림한뒤 
	//  리턴하는 trunc()라는 함수를 정의하시오.
	//  ex) 3.25 -> 3
	//2.실수를 입력받아서 소숫점 이하 첫째자리에서 올림한뒤 
	//  리턴하는 floor()라는 함수를 정의하시오.
	//  ex) 1.45 -> 2
 	//3.실수를 입력받아서 소숫점 이하 첫째자리에서 반올림한뒤 
	//  리턴하는 round()라는 함수를 정의하시오.
	//  ex) 4.5 -> 5, 4.49 -> 4

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	System.out.println("숫자를 입력해주세요");
	double number = scanner.nextDouble();
	System.out.println(trunc(number));
	System.out.println(floor(number));
	System.out.println(Math.round(number));

	}

	private static int trunc(double number) {
		return (int)number;
	}

	private static int floor(double number) {
		if(number % 1 != 0) {
			return (int)number + 1;
		}else { 
		return (int)number;
		}
	}

	private static int round(double number) {
		if(number % 1 >= 0.5) {
			return floor(number);
		}
		  return trunc(number);
	}
	
	
}

