package com.inc.assignment;

public class AssignmentEx1 {
	public static void main(String[] args) {
		//과제1 : 아래와 같은 형태의 별을 출력해 보세요.
		//hint1 : 공백은 System.out.print(" ");으로 출력할수 있다.
		//hint2 : if문 (사용해도 되고 안해도 된다)
		//*
		// *
		//  *
		//   *
		//    *

	  	
	  	for(int i = 0; i < 5; i++) {
		  	for(int j= 0; j <= i-1; j++) {
		  		System.out.print(" ");
		  	}
		  	System.out.println("*");
		}
	  	for(int i = 0; i < 5; i++) {
		  	for(int j= 0; j <= i; j++) {
		  		if(i == j) {
		  		System.out.print("*");
		  	}else {
		  	System.out.print(" ");
	  	}
		  	
		}
	  	}
	  	
	}
}

