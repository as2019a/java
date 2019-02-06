package com.inc.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		int[] odd = {1,3,5,7,9};
		
		int[] oddCopy = odd;
		
		odd = new int[6];
		
		for(int i = 0; i < odd.length; i++) {
			odd[i] = oddCopy[i];
		}
		
		odd[5] = 11;
	
		for(int i : odd) {
			System.out.println(i);
		 }
	}
		
}
