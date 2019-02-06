package com.inc.third;

public class FifthClass extends FourthClass{
	
	void test() {
		//private으로 선언한 변수, 메서드는 상속X
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		//System.out.println(pri);
		pubMethod();
		proMethod();
		defMethod();
		//priMethod();
	}



}
