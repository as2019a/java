package com.inc.example;

import java.util.Scanner;

public class HelloMembers {
	//생성자가 필요한 이유
	//인스턴스가 생성될 때 필수적으로 실행되어야 하는 로직이 있고
	//그 것을 강제해야 하는 경우
	
	//1.초기화 과정이 복잡한 경우
	String[] members = new String[3];
	Scanner scanner = new Scanner(System.in);
	
	public HelloMembers() {
		init();
	}
	
	public void init() {
		for(int i = 0; i < members.length; i++) {
			System.out.printf("%d번째 이름을 입력해 주세요\n", i + 1);
			members[i] = scanner.nextLine();
		}
	}
	
	public void hello() {
		for(String member : members) {
			System.out.println(member + "님 안녕하세요");
		}
	}
}
