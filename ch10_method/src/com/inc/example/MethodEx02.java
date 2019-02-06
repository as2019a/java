package com.inc.example;

public class MethodEx02 {

	public static void main(String[] args) {
		
		//2.반복문 사용
		//장점
		//1.타이핑하기 쉽다.
		//2.가독성이 좋다.
		//3.유지보수가 편하다.
		for(int k = 0; k < 3;k++) {
			int total = 0;
			for(int i = 5; i <= 10; i++) {
				//total = total + 1;
				total += i;
			}
			System.out.println(total);
			System.out.println("Hello World");
		}
		//단점
		//반복사이에 다른 코드를 집어넣을 수가 없다.
		
		
		
		
	}

}
