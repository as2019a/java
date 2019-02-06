package com.inc.type;

public class NumberEx1 {

	public static void main(String[] args) {
		byte b = -128;
		System.out.println(b);
		
		//byte타입의 변수는 -128보다 작은 정수를 저장할 수 없다.
		//byte b2 = -129;
		//System.out.println(b2);
		
		//127보다 큰 숫자를 저장할 수 없다.
		//byte b3 = 128;
		
		//byte b4 = 127;
		//b4 = b4 + 1;
		
		short s1 = 128;
		short s2 = 32767;
		//short s3 = 32768;
		
		//실습 : int에 저장가능한 최대 숫자를 변수에 저장해 보세요.
		int il = 2147483647;
		//int il = 2147483648;
		
		long li = 2147483648L;
	}

}
