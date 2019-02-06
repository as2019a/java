package com.inc.classdesign.v1;

import java.util.Scanner;

public class Diary {
  Scanner scanner = new Scanner(System.in);
  DbConnector connector = new OracleConnector();
  //DbConnector connector = new MySqlConnector();
  
  public void write( ) {
  	System.out.println("입력해 주세요");
  	String str = scanner.nextLine();
  	connector.connect();
  	connector.insert(str);
  	
  	
 }
}

