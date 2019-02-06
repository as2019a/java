package com.inc.polymorphism;

public class Tiger extends Animal implements Carnivore {
	void crying() {
		System.out.println("어흥");
	}
	
	public boolean hunt(Herbivore herbivore) {
		if(Math.random() > 0.5) {
			herbivore.setAlive(false);
			return true;
		}else {
			return false;
		}
	}

}
