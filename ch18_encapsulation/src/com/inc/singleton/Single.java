package com.inc.singleton;

public class Single {
	//singleton pattern
	
	//2.내부에서 인스턴스를 생성한다음에 저장해 둘 변수를 선언한다.
	private static Single single;
	
	//1.생성자를 private으로 선언
	private Single() {
	}
	
	//3.외부에서 인스턴스를 가져갈수 있게끔 getlnstance라는 메서드를 선언한다
	public static Single getInstance() {
		if(single == null) {
		single = new Single();
		}
		return single;
	}
		
	
}
