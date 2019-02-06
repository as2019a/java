package com.inc.example;

import java.util.Scanner;

public class HelloTest {

	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in);
		Hello hello = new Hello(); //생성자는 new라는 키워드 호출
    hello.hello();
    hello.hello();
    hello.hello();
    
    Hello hello2 = new Hello();
    hello2.hello();
		
	}

}
