package com.inc.classdesign.v2;

import java.util.Scanner;

public class Diary {
  Scanner scanner = new Scanner(System.in);
  DbConnector connector;
  //DbConnector connector = new MySqlConnector();
  
  public Diary(MySqlConnector connector) {
		this.connector = connector;
	}
  
  public void write( ) {
  	System.out.println("입력해 주세요");
  	String str = scanner.nextLine();
  	connector.connect();
  	connector.insert(str);
  	
  	
 }
}

