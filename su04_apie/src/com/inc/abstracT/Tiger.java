package com.inc.abstracT;

public class Tiger extends Animal implements Carnivore {
	void crying() {
		System.out.println("어흥");
	}
	
	public boolean hunt(Horse horse) {
		if(Math.random() > 0.5) {
			horse.isAlive = false;
			return true;
		}else {
			return false;
		}
	}

}
