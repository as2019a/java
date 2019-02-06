package com.inc.system;

public class SystemEx3 {

	public static void main(String[] args) {
		long now = System.nanoTime();
		System.out.println(now);
		//진행한코드
		long a = 0;
		for(int i = 0; i < 1000000000; i++) {
			a += i;
		}
		System.out.println(System.currentTimeMillis() - now);
	}
}
