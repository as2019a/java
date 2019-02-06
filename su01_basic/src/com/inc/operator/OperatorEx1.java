package com.inc.operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 증감연산자
		int i = 0;
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println(i++);
		System.out.println(i);
		int index = 0;
		int[] odd = {1, 3, 5, 7, 9 ,11};
		System.out.println(odd[index++]);
		System.out.println(odd[index++]);
		System.out.println(odd[index++]);
		
		int x = 10;
		System.out.println(x-- + x);
		System.out.println(x--);
		System.out.println(--x);
		

	}

}
