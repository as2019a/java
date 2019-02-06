package com.inc.scope;

public class ScopeEx1 {
	
	int i = 0;

	public static void main(String[] args) {
		ScopeEx1 ex1 = new ScopeEx1();
		System.out.println("ex1:"+ex1);
		ex1.foo();
		ex1.bar();
		
		ScopeEx1 scope2 = new ScopeEx1();
		System.out.println("scope2"+scope2);
		
	}
	
	void foo() {
		int i = 1;
		System.out.println(i);
		System.out.println("this"+this);
		System.out.println(this.i);
	}
	
	void bar() {
		System.out.println(i);
	}

}
