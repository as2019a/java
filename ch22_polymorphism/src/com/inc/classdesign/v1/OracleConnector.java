package com.inc.classdesign.v1;

public class OracleConnector implements DbConnector {

	@Override
	public void connect() {
		//oracle에 연결하는 코드
		System.out.println("oracle에 접속되었습니다");
	}

	@Override
	public void insert(String data) {
	  //oracle에 데이터를 입력하는 로직
		System.out.println("oracle에 데이터가 저장되었습니다");
	}
	
	//** MySql connector **

}
