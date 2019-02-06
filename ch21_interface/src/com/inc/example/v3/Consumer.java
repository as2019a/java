package com.inc.example.v3;

public class Consumer {

	public static void main(String[] args) {
		Producer producer = new Producer();
		//Producer의 변화가 Consumer에게 까지 영향을 미침
		producer.aservice(5);

	}

}
