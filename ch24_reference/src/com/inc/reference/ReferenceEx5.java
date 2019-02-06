package com.inc.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] odd = {1, 3, 5, 7, 9};
		changer(odd);
		System.out.println(odd[0]);
	}
	
	private static void changer(int[] arr) {
		arr[0] = -1;
	}
	
}
