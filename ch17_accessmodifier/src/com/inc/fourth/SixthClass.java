package com.inc.fourth;

import com.inc.third.FifthClass;

public class SixthClass extends FifthClass{
	
	void test() {
	    //default으로 선언한 변수, 메서드는 같은패키지일 경우에만 상속
		  //privated로 선언한 변수, 메서드는 같은패키지일 경우에만 상속
			System.out.println(pub);
			System.out.println(pro);
			//System.out.println(def);
			//System.out.println(pri);
			pubMethod();
			proMethod();
			//defMethod();
			//priMethod();

		
	}

}
