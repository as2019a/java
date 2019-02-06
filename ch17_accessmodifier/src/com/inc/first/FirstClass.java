package com.inc.first;

public class FirstClass {
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
		
		void test() {
			System.out.println(pub);
			System.out.println(pro);
			System.out.println(def);
			System.out.println(pri);
			
			pubMethod();
			proMethod();
			defMethod();
			priMethod();
		}
	
	public static void main(String[] args) {
		FirstClass fc = new FirstClass();
		//fc.test();
		System.out.println(fc.pub);
		System.out.println(fc.pro);
		System.out.println(fc.def);
		System.out.println(fc.pri);
		
		fc.pubMethod();
		fc.proMethod();
		fc.defMethod();
		fc.priMethod();
	 }
	}
