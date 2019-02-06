package com.inc.abstracT;

public class Wolf extends Animal implements Carnivore {
	
	@Override
	void crying() {
		System.out.println("아울~~~");
	}
	
	public boolean hunt(Horse horse) {
		if(Math.random() > 0.7) {
			horse.isAlive = false;
			return true;
		}else {
			return false;
		}
	}
	
}
