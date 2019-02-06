package com.inc.method;

public class MethodEx2 {

	public static void main(String[] args) {
		MethodEx2 ex2 = new MethodEx2();
		//실수 두개를 받아서 합을 리턴하는 함수를 정의하시오.
		double result = ex2.sum(10.5, -5.3);
		//반지름을 받아서  원의 넓이를 "출력"하는 메서드를 정의하시오.
		ex2.areaCircle(5.3);
		
		ex2.sum(10, 20, 30, 40);
		
		//1~파라미터로 받은 숫자까지 전부 다해서 리턴하는 함수를 정의하시오.
		System.out.println(ex2.sequence(10));
	}
		
			
	int sequence(int last) {
		/*int total = 0;
		for(int i = 1; i <= last; i++) {
			total += i;
		}*/
		return (1 + last)*last/2;
	}


	//반환형
	void areaCircle(double ras) {
		System.out.println(Math.PI * ras * ras);
	}
	
	
	//반환형 함수이름(파라미터 변수이름) { 코드 }
	double sum(double a, double b) {
		return a + b;
	}
	
	//variable arguments
	void sum(int ... numbers) {
		int total = 0;
		for(int n : numbers) {
			total += n;
		}
		System.out.println(total);
		
	}
	
}
