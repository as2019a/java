package com.inc.thread.v1;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 65; i < 165; i++) {
			System.out.println((char)i);
			Thread.sleep(500);
		}

	}

}
