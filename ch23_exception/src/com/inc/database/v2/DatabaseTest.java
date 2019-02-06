package com.inc.database.v2;

public class DatabaseTest {

	public static void main(String[] args) {
		Database db = new Database();
		//호출하는 쪽에서 예외처리
		try {
			db.insert(null);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		
		db.read();

	}

}
