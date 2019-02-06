package com.inc.sixth;


//import com.inc.fifth.DefaultClass;
import com.inc.fifth.PublicClass;

public class Test {

	public static void main(String[] args) {
		//public으로 선언한 클래스는 다른패키지에서도 가능
		PublicClass publicClass = new PublicClass();
		
		//default로 선언한 클래스는 다른패키지에서 접근불가
		//(갘은 패키지에서만 접근가능)
		//DefaultClass DefaultClass = new DefaultClass();
	}

}
