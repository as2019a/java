package com.inc.third;

public class FourthClass {
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	
	public void pubMethod() {
		System.out.println("public method");
	}
	
	protected void proMethod() {
		System.out.println("protedted method");
	}
	
	void defMethod () {
		System.out.println("default method");
	}
		
	private void priMethod() {
		System.out.println("private method");
	}

}
