package com.inc.accessmodifier;

public class SecondClass {

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		System.out.println("fc.publicMsg");
	  //System.out.println(fc.privateMsg);
		fc.publicMeythod();
		//fc.privateMethod();
		
	}

}
