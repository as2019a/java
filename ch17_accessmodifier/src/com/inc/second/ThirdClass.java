package com.inc.second;

import com.inc.first.FirstClass;

public class ThirdClass {

	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		System.out.println(fc.pub);
		//System.out.println(fc.pro);
		//System.out.println(fc.def);
		//System.out.println(fc.pri);
		
		fc.pubMethod();
		//fc.proMethod();
		//fc.defMethod();
		//fc.priMethod();

	}

}
