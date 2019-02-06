package com.inc.thread.v2;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		Thread workingthread = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("\t"  + i);
					/*try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
				}
			}
		};
		workingthread.start();
		for(int i = 65; i < 165; i++) {
			System.out.println((char)i);
			//Thread.sleep(500);
		}

	}

}
