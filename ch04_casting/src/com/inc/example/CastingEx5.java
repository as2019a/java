package com.inc.example;

public class CastingEx5 {

	public static void main(String[] args) {
		//형변환을 왜 알아야 하는가?
		
		//1.데이터간에 연산 도중 의도치 않은 경과(데이터손실)을 방지하기 위해
		int i1=5/2;
		System.out.println(i1);
		
		double d1=5/2;
		System.out.println(d1);
		
		double d2=(double)5/2;
		System.out.println(d2);
		
		//2.객체의 형변환 - 해당 챕터에서 다룸

	}

}
