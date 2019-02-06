package com.inc.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
	int i = 0;
	Integer wrapi = new Integer(0);
	//Integer.parseInt("0");
	System.out.println(i);
	System.out.println(wrapi);
	System.out.println(i == wrapi);
	
	Float wrapf = new Float(3.14f);
	System.out.println(wrapf.floatValue());
	
	//auto Boxing
	Character wrapc = 'A';
	
	//auto unBoxing
	char c = new Character('A');
	
	System.out.println(wrapc == c);
	
	Character wrapc2 = 'A';
	System.out.println(wrapc == wrapc2);
	
	Character wrapc3 = new Character('A'); 
	System.out.println(wrapc == wrapc3);
	
  }
}
