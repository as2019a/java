package com.inc.classdesign;

public class MySqlConnector implements DbConnector {

	@Override
	public void connect() {
	 //MySql에 연결하는 코드
	 System.out.println("MySql에 접속되었습니다");		
	}

	@Override
	public void insert(String data) {
	 //MySql에 데이터를 입력하는 로직
	 System.out.println("MySql에 데이터가 저장되었습니다");
	}
	
}
