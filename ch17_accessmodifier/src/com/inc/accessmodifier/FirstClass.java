package com.inc.accessmodifier;

public class FirstClass {
	public String publicMsg = "public";
	private String privateMsg = "private";

	public void publicMeythod() {
		System.out.println("public");
    System.out.println(privateMsg);
    
	}
	
	//private을 출력하는 publicMeythod선언(접근제한자 : private)
	private void privateMethod() {
		System.out.println("private");
    System.out.println(privateMsg);
	}

}
