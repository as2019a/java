package com.inc.math;

public class mathEx3 {

	public static void main(String[] args) {
		//floor - 내림(작은 정수값)
		System.out.println(Math.floor(10.5));
		System.out.println(Math.floor(10.99999));
		System.out.println(Math.floor(-10.99999));
		System.out.println((int)-10.99999);
		
		//cell - 올림(가까운 큰 정수값)
		System.out.println(Math.ceil(10.00001));
		System.out.println(Math.ceil(10.99999));
		System.out.println(Math.ceil(-10.99999));
		
		//round - 반올림(사사오입)
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.499999));
		System.out.println(Math.round(-10.5));
		System.out.println(Math.round(-10.51));
		System.out.println(Math.round(-10.499999));
		
		//max, min
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.max(-10, -20));
		System.out.println(Math.min(-10, -20));
		
	}

}
