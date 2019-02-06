package com.inc.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] sportsStars = {"박태환", "김연아", "손연재"};
		String[] singers = {"윤종신", "윤하", "김동률"};
		
		System.out.println(sportsStars[0]);
		System.out.println(singers[2]);
		//System.out.println(singers[3]);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(sportsStars[i]);
			
		}
		//실습 for문을 사용하여 ~~~가 노래를 부른다 라고 출력해 보세요.
		for(int i = 0; i < singers.length; i++) {
			System.out.printf("%s가 노래를 부른다\n", singers[1]);
			
		}
		
		//실습 위 결과를 while를 사용해서 출력해보세요.
		int i = 0;
		while(1 < singers.length) {
			System.out.printf("%s가 노래를 부른다\n", singers[1]);
			i++;
			
		}
	}

}
