package com.inc.example;

public class CastingEx3 {

	public static void main(String[] args) {
		//1.형변환은 면시적 형변환과 암(묵)시적 형변환이 있으며
		//  형변환을 거칠시 데이터의 손실이 발생할 수도 있다.
		
		//명시적 형변환 : 형변환 코드를 적어줘야지만 에러가 발생X
		//더 작은 범위를 표현할 수 있는 자료형으로 형변환
		
		double d1=123456789.123456789;
		float f1=(float)d1;
		System.out.println(f1); //-> 123456792
		
		long l1=(long)f1;
		System.out.println(l1);
		
		float f2=123456789000000000000000000f;
		long l2=(long)f2;
		System.out.println(l2);
		
		int i2=(int)l2;
		System.out.println(i2);

	}

}
