package com.inc.stringbuffer;

import java.util.Scanner;

public class StringbufferEx1 {

	public static void main(String[] args) {
		
		//사용자로 부터 문자열을 입력받은 다음에 최종적으로 모두 더해서 문자열을
		//출력
		Scanner scanner = new Scanner(System.in);
		String Input = "";
		while(true) {
			System.out.println("단어를 입력해 주세요. (종료 : X)");
			String tmp = scanner.nextLine();
			if("X".equals(tmp)) {
				break;
			}
			Input += tmp;
		}
		System.out.println(Input);
	}
}
