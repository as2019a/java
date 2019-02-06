package com.inc.example;

public class CastingEx4 {

	public static void main(String[] args) {
		//2. boolean을 제외한 나머지 자료형으로 형변환이 가능하다.
		//   (char도 내부적으로는 숫자로 저장되기 때문에)
		
		char c1='가';
		int i1=c1;
		short s1=(short)c1;
		byte b1=(byte)c1;
		
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(b1);
		
		//short, char모두 2byte를 저장할 수 있지만
		//char 0 ~ 65535, short -32768 ~ 32767로 범위가 다르다.

	}

}
