package com.inc.example;

public class MethodEx06 {

	public static void main(String[] args) {
		String [] stars = {"박태환","김연아","손연재","서장훈","이동국"};
		String [] singers = {"윤종신","윤아","김동률"};
		
		helloMembers(stars);
		helloMembers(singers);
	}
	 
	//2018-08-24 코드 추가 수정
	
	public static void helloMembers(String[] members) {
		for(String member : members) {
			member = "a";
			System.out.println("hello " + member);
			//System.out.println("hello " + member);
		}
	}

}