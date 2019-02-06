package com.inc.stirng;

public class StringEx1 {

	public static void main(String[] args) {
		String str1 = "Hello"; //literal방식의 생성
		String str2 = new String("Hello"); //일반 인스턴스 생성
		//주소값 비교
		System.out.println(str1 == str2); //false
		//내용 비교
		System.out.println(str1.equals(str2)); //
		String str3 = "Hello";
		System.out.println(str1 == str3);

	}

}
