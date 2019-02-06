package com.inc.variable;

public class VariableEx4 {

	public static void main(String[] args) {
		//변수의 규칙(강제)
		//1.이미 선언한 변수명은 재선언 할 수 없다.
		String name = "LYS";
		
		//String name = "";
		
		//2.데이터의 자료형과 변수의 자료형이 일치해야만 저장할 수 있다.
		//char변수에 String데이터를 저장 할 수 없다.
		//char char1 = "";
		
		//3.변수명에 특수문자 사용 금지($, _는 사용가능)
		//int ^myname;
		String $myname = "LYS";
		
		//4.예약어(키워드)는 사용 금지(대표적으로 자료형)
		//int int = 3;
		//int void = 5;
		
		//변수의 관례(convention)
		//1.소문자로 시작
		String Myname = "flynn";
		String 이름 = "한국";
		
		//2._나 $로 시작하지 않는다.
		
		//3.여러 단어를 사용하고 싶은 경우
		
		String myfirstName = "flynn"; //Camel case
		String my_last_name = "jang"; //snake case
		
		System.out.println("---------------");
		//실습 
		//본인의 이름, 직업, 나이, 주소, 키(실수)정보들을 변수에 저장하고 출력
		// 성별(char),
		String myname = "이영섭";
		String job = "구직자";
		int age = 29;
		String address = "서울특별시 영등포구 대림3동";
		double height = 170;
		char gender = '남';
		
	}

}
