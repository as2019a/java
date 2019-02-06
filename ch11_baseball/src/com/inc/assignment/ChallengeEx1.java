package com.inc.assignment;

import java.util.Scanner;

public class ChallengeEx1 {

	private static final int out = 0;

	public static void main(String[] args) {
		//현재 야구게임은 숫자 3개를 맞추는 게임인데
		//게임시작시 사용자로부터 2~5의 정수를 입력받고
		//입력받은 숫자만큼 맞추는 게임이 되도록 코드를 업그레이드 하시오.

		Scanner scanner = new Scanner(System.in);
		int i,j=0;
		int index,temp=0;
		
		//2~5까지 숫자들이 들어있는 num 배열
		int[] num = {2,3,4,5};
		int rand_num;
		int[] num2 = new int[3];
		int[] b = new int[3];
		int s_count = 0;
		int b_count = 0;
		int l_count = 5;
		int arr[][] = new int[2][10];
		
		for(i = 0; i < 6; i++); {
		arr[1][i] = 0;
		} //2행의 값을 0으로 초기화 작업.
		
		for(i = 0; i < 6; i++) {
		// 1행에 2부터 5까지 숫자 입력 	
		arr[0][i] = i; 
		
		//랜덤값 카운트
		for(i = 0; i < 1000; i++) {
			rand_num = (int)(Math.random()*5);
			arr[1][rand_num]++;
		}
		
		for(i = 0; i < 6; i++) {
			index = 1;
			for(j= i+1; j < 6; j++) {
				if(arr[1][index] < arr[1][j]) {
					index = j;
				}
			}
			//1행과 2행의 값들을 swap
			temp = arr[0][i];
			arr[0][i] = arr[0][index];
			arr[0][index] = temp;
			temp = arr[1][i];
			arr[1][i] = arr[0][index];
			arr[1][index] = temp;
		}
		
		for(i = 0;i < 3;i++) {
			System.out.printf("%d\t", arr[0][i]);
		}
		
		System.out.printf("\n");
		
		while(true) {
			System.out.print("attack : ");
			Integer attacker = scanner.nextInt();
			
			b[0] = attacker/100;
			System.out.print(b[0]);
			b[1] = attacker/10 - b[0] * 10;
			System.out.print(b[1]);
			b[2] = attacker/1 - b[0] * 100 - b[1]*10;
		  System.out.print(b[2]);
		  
		  for(i=0; i<3; i++) {
		  	num2[i] = b[i];
		  }
		  
		  for
		  (i = 0; i < 3; i++) {
		  	for(j = 0; j < 3; j++) {
		  		if(num[arr[0][i]] == b[j] && i==j) {
		  			b_count++;
		  		}
		  	}
		  }
		  System.out.printf("\n");
		  
		  if(l_count == 0) {
		  	System.out.println("lose..."); break;
		  }
		  
		  if(s_count == 3) {
		  	System.out.println("!! Win !!"); break;
		  }
		  
		  System.out.printf("%ds%dB",s_count,b_count);
		  
		  s_count=0;
		  b_count=0;
		  l_count--;
		  
		  System.out.printf("\n");
		}
		//업그레이드 된 야구게임으로 코드가 복잡합니다...
		}
	
	}
}
