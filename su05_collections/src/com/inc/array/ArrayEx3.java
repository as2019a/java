package com.inc.array;

public class ArrayEx3 {

	public static void main(String[] args) {
		char[][] characters = {
					{'A','B','C','D','E'},
					{'a','b','c','d'},
					{'0','1','2','3','4','5'},
					{'!','@','#','$','\n','\t','\\'}
				};
		System.out.println(characters[3][6]);
		
		char[][] char2DArray = new char[4][];
		char2DArray[0] = new char[5];
		char2DArray[0][0] = 'A'; 
		char2DArray[0][1] = 'B'; 
		char2DArray[0][2] = 'C'; 
		char2DArray[0][3] = 'D'; 
		char2DArray[0][4] = 'E';
		
		char2DArray[1] = new char[4];
		char2DArray[2] = new char[6];
		char2DArray[3] = new char[7];
	}
}
