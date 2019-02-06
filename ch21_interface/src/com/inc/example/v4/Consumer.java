package com.inc.example.v4;

public class Consumer {

	public static void main(String[] args) {
		Moderator moderator = new Producer();
		//Producer의 변화가 Consumer에게 까지 영향을 미침
		moderator.service();

	}

}
