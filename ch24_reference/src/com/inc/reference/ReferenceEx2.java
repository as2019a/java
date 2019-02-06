package com.inc.reference;

import java.util.Scanner;

public class ReferenceEx2 {

	public static void main(String[] args) {
		 String r = "Hello";
		 String r2 = new String("Hello");
		 System.out.println(r);
		 System.out.println(r2);
		 
		 //주소 비교
		 System.out.println(r == r2);
		 
		 String r3 = "Hello";
		 System.out.println(r == r3);
		 
		 Scanner scanner = new Scanner(System.in);
		 String r4 = scanner.nextLine();
		 
		 System.out.println(r == r4);
		 //내용 비교
		 System.out.println(r.equals(r4));
	}

}
