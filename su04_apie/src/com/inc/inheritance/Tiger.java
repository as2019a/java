package com.inc.inheritance;

public class Tiger extends Animal {
	void crying() {
		System.out.println("어흥");
	}
	
	boolean hunt(Horse horse) {
		if(Math.random() > 0.5) {
			horse.isAlive = false;
			return true;
		}else {
			return false;
		}
	}

}
