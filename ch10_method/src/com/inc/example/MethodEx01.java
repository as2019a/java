package com.inc.example;

public class MethodEx01 {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i =0; i <= 100; i++) {
			//total = total + 1;
			total += i;
		}
		System.out.println(total);
		
		total = 0;
		for(int i =0; i <= 100; i++) {
			//total = total + 1;
			total += i;
		}
		System.out.println(total);
		
		total = 0;
		for(int i =0; i <= 100; i++) {
			//total = total + 1;
			total += i;
		}
		System.out.println(total);
		
		//똑같은 코드를 여러번 반복해서 작성
		//단점
		//1.타이핑하기 힘들다.
		//2.가독성이 나쁘다(코드양이 증가)
		//3.유지보수가 힘들다.
	}

}
