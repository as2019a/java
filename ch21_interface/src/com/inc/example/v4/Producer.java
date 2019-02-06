package com.inc.example.v4;

public class Producer implements Moderator{
	@Override
	public void service() {
		System.out.println(etc());
	}
	
	private int etc() {
		return 0;
	}
}
