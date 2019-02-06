package com.inc.database.v1;

public class Database {
	
	private String memory;
	//CRUD
	
	public void insert(String input) {
		//1.if(input == null || "".equals(input)); - null cheak
		//2.if(input == null || input.equals("")); - null cheak
		if(input == null || "".equals(input)) {
			System.out.println("공백은 입력할 수 없습니다");
			return;
		}
		memory = input;
		System.out.println("저장 완료 :" + input);
	}
	
	public void read() {
		System.out.println("불러오기 완료 : " + memory);
	}
}
