package com.inc.example;

public class MethodEx08 {

	public static void main(String[] args) {
	// a -> c -> b
		a();
		//recursion();
		System.out.println(factorial(5));
	}
	
	public static void a() {
		System.out.println("a");
		b();
	}
	
	public static void b() {
		c();
		System.out.println("b");
	}
	
	public static void c() {
		System.out.println("c");
	}
  
	public static void recursion() {
		System.out.println("재귀");
		recursion();
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
		  return n * factorial(n-1);
		}
	}

}