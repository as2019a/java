package com.inc.components3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NewProgams4 {
	public static int base;

	public static void main(String[] args){

		static double PI = 3.14;
    // 클래스 변수인 base가 추가되었다.
    static int base = 0;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        // 더하기에 base의 값을 포함시킨다.
        System.out.println(this.left + this.right + base);
    }
 
    public void avg() {
        // 평균치에 base의 값을 포함시킨다.
        System.out.println((this.left + this.right + base) / 2);
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
    	NewProgams4 c1 = new NewProgams4();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();
 
        NewProgams4 c2 = new NewProgams4();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();
 
        // 클래스 변수 base의 값을 10으로 지정했다.
        NewProgams4.base = 10;
 
        // 40 출력
        c1.sum();
 
        // 70 출력
        c2.sum();
 
    }
		
		
	
	}
}
