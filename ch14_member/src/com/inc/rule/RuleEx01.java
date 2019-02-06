package com.inc.rule;

public class RuleEx01 {

	//클래스 변수
	static int a = 1;
	
	static //인스턴스 변수
	int b = 2;
	
	//클래스 메서드
	public static void main(String[] args) {
		//클래스 메서드 -> 클래스 메서드(O)
		a();
		//클래스 메서드 -> 인스턴스 메서드(X)
		//b();
		//클래스 메서드 -> 클래스 변수(O)
		System.out.println(a);
		//클래스 메서드 -> 인스턴스 변수(X)
		System.out.println(b);
		
		RuleEx01 ex1 = new RuleEx01();
		ex1.b();
		System.out.println(ex1.b);
		

	}
	
	//클래스 메서드
	static void a() {
		System.out.println("a");
	}
	
	//인스턴스 메서드
	void b() {
		System.out.println("b");
		//인스턴스 메서드 -> 클래스 메서드(O)
		a();
		
		//인스턴스 메서드 -> 인스턴스 메서드(O)
    b();
    
    //인스턴스 메서드 -> 클래스 변수(O)
    System.out.println(a);
    
    //인스턴스 변수 -> 인스턴스 변수(O)
    System.out.println(b);
    
	}

}
