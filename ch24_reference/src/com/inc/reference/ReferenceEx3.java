package com.inc.reference;

public class ReferenceEx3 {
	
	public static void main(String[] args) {
		int i = 0; //기본자료형 간 복사 = 값 복사, 지역변수 i에 복사 0이 들어온 값
		puls(i);
		System.out.println(i); //변경이 일어나지 않는다.
	}
	
	private static void puls(int i) {
		i += 1; //결과 : i 는 0으로 변경
	}
	
}
