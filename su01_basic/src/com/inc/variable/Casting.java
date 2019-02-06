package com.inc.variable;

public class Casting {

	public static void main(String[] args) {
		//암시적 캐스팅 - 작은 자료형 큰 자료형으로(데이터의 손실 x -> JVM이 알아서 처리)
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		
		float f = 3.14f;
		double d = f;
		
		char c = 'A';
		int i2 = c;
		short hanja = (short)'願';
		System.out.println((char)39000);
		System.out.println(hanja);
		System.out.println((char)-26536);
		System.out.println((byte)128);
		System.out.println(Short.MAX_VALUE);
		byte price = 10;
		System.out.println(price + 10);

	}

}
