package com.inc.database.v4;

public class Database {
	
	private String memory;
	//CRUD
	
	public void insert(String input) throws StringMismatchException {
		//throws RuntimeException
		//1.if(input == null || "".equals(input)); - null check
		//2.if(input == null || input.equals("")); - null check
		if(input == null || "".equals(input)) {
			//System.out.println("공백은 입력할 수 없습니다");
			//예외생성
			//RuntimeException e = new RuntimeException("null 또는 공백을 입력할 수 없습니다");
			StringMismatchException e = new StringMismatchException("null 또는 공백을 입력할 수 없습니다");
			//예외를 insert를 호출하는 쪽으로 던질수 있다.
			throw e;
			//return;
		}
		memory = input;
		System.out.println("저장 완료 :" + input);
	}
	
	public void read() {
		System.out.println("불러오기 완료 : " + memory);
	}
}
