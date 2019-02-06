

package com.inc.example;

public class MethodEx03 {

	public static void main(String[] args) {
		
	//메소드 호출
	sum();
	System.out.println("채용안내");
	sum();
	System.out.println("서류전형 -> 면접전형");
	sum();
	System.out.println("합격&불합격 통보");
	
	}
	
	//메소드 정의
	public static void sum() {
		int total = 0;
		for(int i = 5; i <= 10; i++) {
			//total = total + 1;
			total += i;
	  }
		System.out.println(total);
	}
}