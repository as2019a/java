package com.inc.variable;

public class Casting2 {

	public static void main(String[] args) {
		//명시적 형변환 - 큰 자료형에서 작은 자료형으로 형변환(데이터 손실 발생 가능)
		double d = 123456789123456789.123456789123456789;
		System.out.println(d);
		//1.23456789123456784E17
		float f = (float)d;
		System.out.println(f);
		//1.23456791E17
		
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		short s = (short)i;
		System.out.println(s);
		
		short s2 = Short.MAX_VALUE;
		System.out.println(s2);
		byte b = (byte)s2;
		System.out.println(b);

	}

}
