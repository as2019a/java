package com.inc.system;

public class SystemEx1 {

	public static void main(String[] args) {
		int a = 0;
		while(a < 10) {
			System.out.println(a);
			a++;
			if(a == 5) {
				//프로그램을 정상 종료시키는 메서드
				System.exit(0);
			}
		}

	}
}
