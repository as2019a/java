package com.inc.assignment;

import java.util.Scanner;

public class ChallengeEx3 {
	public static void main(String[] args) {
		char[] increpas = {'I', 'N', 'C', 'R', 'E', 'P', 'A', 'S'};
		
		//문자 한 개를 입력받아 위 배열에서의 위치를 출력하는 
		//프로그램을 작성하시오.
		//첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 
		//"none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해 주세요");
		char c = scanner.nextLine().charAt(0);
		for(int i = 0; i < increpas.length; i++) {
			if(increpas[i] == c) {
				System.out.println(i);
				break;
			}
			if(i == increpas.length - 1) {
				System.out.println("none");
			}
		}
	}
}







