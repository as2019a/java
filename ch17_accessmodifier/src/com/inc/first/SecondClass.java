package com.inc.first;

public class SecondClass {

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		System.out.println(fc.pub);
		System.out.println(fc.pro);
		System.out.println(fc.def);
		//System.out.println(fc.pri);
		
		fc.pubMethod();
		fc.proMethod();
		fc.defMethod();
		//fc.priMethod();

	}

}
