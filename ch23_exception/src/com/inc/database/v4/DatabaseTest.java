package com.inc.database.v4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DatabaseTest {

	public static void main(String[] args){
		//throws StringMismatchException
		Database db = new Database();
		//호출하는 쪽에서 예외처리
		/*try {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}*/
		//uncheck예외(RuntimeException 또는 그 자식클래스들)는
		//처리하지 않아도 된다
		try {
			db.insert(null);
			db.read();
		} catch (StringMismatchException e) {
			System.out.println(e.getMessage());
		}
		//db.read();
		
		
	/*	Scanner scanner = new Scanner(System.in);
		try {
			scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("제대로 된 입력을 해주세요");
			System.out.println("-10억 ~ +10억 이내의 정수");
			System.out.println(e.getMessage());
		}*/
		

	}

}
