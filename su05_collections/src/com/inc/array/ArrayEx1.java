package com.inc.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		//리터럴 방식 (배열을 생성하면서 동시에 데이터를 입력 -> 사이즈 결정)
		String[] seats = {"박태환","김연아","손연재"};
		
		//객체생성 방식 (배열을 생성하면서 공간만 지정)
		String[] seats2 = new String[3];
		System.out.println(seats2[0]);
		seats2[0] = "윤종신";
		seats2[1] = "윤아";
		seats2[2] = "김동률";
		System.out.println(seats2[0]);
		
		for(int i = 0; i < seats.length; i++) {
			//seats[i] = null;
			System.out.println(seats[i]);
		}
		
		for(String name : seats2) {
			System.out.println(name);
		}
		
		char[] chars = new char[3];
		System.out.println(chars[0]+"aa");
		
		
	}

}
