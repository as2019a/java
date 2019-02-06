package com.inc.msn;

public class msn_09 {

	public static void main(String[] args) {
		// int array
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int i = 0;
		int j = 0;
		int sum = 0;
		
		for(i=0;i < array.length;i++) {
			for(j=0;j<array[i].length;j++) {
			System.out.print(array[i][j]);
			System.out.print("\t");
			sum = sum + array[i][j];
		}
		System.out.print("\n");	
	  }
		
	 System.out.println("Total Sum : " + sum);	
		

	}

}
