package com.inc.smart;

import java.awt.Toolkit;
import java.util.Scanner;

public class SmartPhone {
	Scanner scanner = new Scanner(System.in);
	boolean isPlaying;
	
	void run() {
		while(true) {
			System.out.println("기능을 선택하시오");
			System.out.println("1.음악재생");
			System.out.println("2.계산기");
			System.out.println("3.종료");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1 : 
					if(isPlaying) {
						System.out.println("이미 실행중입니다");
					}else {
						playMusic();
					}
				  break;
				case 2 : sum(); break;
				case 3 : return;
			}
		}
	}
	
	void sum() {
		System.out.println("첫 번째 숫자");
		int left = scanner.nextInt();
		System.out.println("두 번째 숫자");
		int right = scanner.nextInt();
		System.out.println(left + right);
	}
	
	void playMusic() {
		isPlaying = true;
		new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 50; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				isPlaying = false;
			}
		}.start();
	}
	
	public static void main(String[] args) {
		new SmartPhone().run();
	}

}







