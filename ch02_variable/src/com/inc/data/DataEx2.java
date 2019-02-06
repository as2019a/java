package com.inc.data;

public class DataEx2 {

	public static void main(String[] args) {
		//""아닌 ''를 사용하게 되면 문자열이 아닌 문자를 의미.
		System.out.println('A');
		System.out.println('가');
		System.out.println('家');
		
		//''안에 문자열을 쓰게되면 에러를 발생한다.
		//System.out.println('apple');
		
		//""안에 문자 하나를 쓰게 되면
		System.out.println("나");
		
		//""안에 아무것도 쓰지 않으면 공백문자열로 인식한다.
		System.out.println("");
	}

}
