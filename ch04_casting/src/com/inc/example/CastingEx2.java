package com.inc.example;

public class CastingEx2 {

	public static void main(String[] args) {
		//1.형변환은 면시적 형변환과 암(묵)시적 형변환이 있으며
		//  형변환을 거칠시 데이터의 손실이 발생할 수도 있다.
		
		//암시적 형변환 : 형변환 코드를 적어주지 않아도 자동으로 형변환
		// -> 더 큰 범위를 표현할 수 있는 자료형으로 형변환
		
		byte b1=100;
		System.out.println(b1);
		
		short s1=b1;
		System.out.println(s1);
		
		int i1=s1;
		System.out.println(i1);
		
		long l1=i1;
		System.out.println(l1);
		
		float f1=l1;
		System.out.println(f1);
		
		long l2=10000000000L;
		
		float f2=l2;
		System.out.println(f2);
		
		double d1=f1;
		System.out.println(d1);
		
		d1=f2;
		System.out.println(d1);

	}

}
