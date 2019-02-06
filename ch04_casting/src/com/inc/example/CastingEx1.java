package com.inc.example;

public class CastingEx1 {

	public static void main(String[] args) {
		//상수 = 변하지 않는 수 = 데이터
		//변수에도 자료형이 있지만 상수에도 자료형이 있다
		//'A'라는 데이터의 자료형은? char
		//"이영섭"데이터의 자료형은? String
		//100이라는 데이터의 자료형은? int
		//100L이라는 데이터의 자료형은? Iong
		//100f이라는 데이터의 자료형은? float
		//100.0이라는 데이터의 자료형은? double
		
		
		//b1이라는 변수의 자료형은 byte이고
		//100이라는 데이터의 자료형은 int임에도 불구하고
		//문제없이 저장된다.
		byte b1=100;
		System.out.println(b1);
		
		int i1=b1;
		System.out.println(i1);
		
		//비밀은 형변환(Casting)에 숨어있다.
		
	}

}
