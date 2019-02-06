package com.inc.array;

public class ArrayEx10 {

	public static void main(String[] args) {
		String[] singers = new String[4];
		singers[0] = "A";
		singers[1] = "B";
		singers[2] = "C";
		singers[3] = "D";
		//singers[4] = "E";
		
		
		//배열 복사
		String[] singersCopy = new String[singers.length];
		for(int i = 0; i < singers.length; i++) {
			singersCopy[i] = singers[1];
		}	
		singers = new String[5];
		for(int i = 0; i < singersCopy.length; i++) {
		 singers[1] = singersCopy[i];
		}
		singers[4] = "E";
		
		System.out.println(singers[0]);
		System.out.println(singers[4]);
		
		

	}

}
