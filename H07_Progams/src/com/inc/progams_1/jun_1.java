package com.inc.progams_1;

import java.util.Scanner;

public class jun_1 {

	public static void main(String[] args) {
		//실력키우기 : 숫자사각형1
		//입력 : 4 5
		/*출력 : 1 2 3 4 5
		       6 7 8 9 10
		       11 12 13 14 15
		       16 17 18 19 20
		*/
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 5; i++) {
	      for (int j = 0; j < 5; j++){
	        System.out.printf("%d ",i*j+1, j);
		     }
	      System.out.println("");
		 }

	}

}
