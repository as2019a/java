package com.inc.example;

public class MethodEx05 {

	public static void main(String[] args) {
		sum(10);
		sum(10, 20);
		sum("Hello","Would");
		sum(1,2,3,4,10,100);

		}
	
	
	public static void sum(int end) {
		int total = 0;
		for(int i = 1; i <= end; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	//매서드의 overloading(오버로딩, 중복선언)
	//규칙 - 메소드의 이름은 같지만 파라미터의 타입이나 갯수가 다르면 다른매서드
	public static void sum(int start, int end) {
		int total = 0;
		for(int i = start; i <= end; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	public static void sum(String first, String second) {
		System.out.println(first + " " + second);
	}
	
	//variable parameter(variable arguments)
	public static void sum(int ... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		System.out.println(total);
	}

}