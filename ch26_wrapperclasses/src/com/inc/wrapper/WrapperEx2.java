package com.inc.wrapper;

public class WrapperEx2 {
	public static void main(String[] args) {
	//사용이유
	//1.기본자료형의 데이터를 참조자료형처럼 사용하기 위해서
	//2.해당 클래스가 제공해주는 다양한 메서드 활용
	Integer i = 128;
	System.out.println(i.intValue());
	System.out.println(i.byteValue());
	System.out.println(i.BYTES);
	
	Byte b = 127;
	System.out.println(Byte.BYTES);
	System.out.println(Double.BYTES);
	
	//숫자형태의 문자 -> 숫자
	int a = Integer.parseInt("500");
	
	//숫자 -> 문자
	String str = Integer.toString(a);
	System.out.println(str);
	System.out.println(a + "");
	
	double b2 = Double.parseDouble("3.14");
	System.out.println(b2);
	}
}
