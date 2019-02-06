package com.inc.type;

public class NumberEx2 {

	public static void main(String[] args) {
		//float의 경우 부동소수점 방식이라는 숫자저장 방식을 사용하기 때문에
		//장점 : 더 큰 숫자도 저장할 수 있다.
		float f1 = 2147483648f;
		System.out.println(f1);
		
		//단점 : 반면 부동소숫점 방식의 특징상 정확도가 떨어질 수 있다.
		float f2 = 12345678901234567890123456789.123456789f;
		         //12345678900000000000000000000.0f;
		System.out.println(f2);
		
		//double은 8byte까지 저장이 가능하므로 float에 비해서 정확도가 더 높다.
		double d1 = 12345678901234567890123456789.123456789;
		System.out.println(d1);
	}

}
