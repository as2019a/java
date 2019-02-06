package com.inc.classdesign.v2;

public class DiaryTest {
	public static void main(String[] args) {
		Diary diary = new Diary(new MySqlConnector());
		//Diary diary = new Diary(new OracleConnector());
		diary.write();
	}
}
