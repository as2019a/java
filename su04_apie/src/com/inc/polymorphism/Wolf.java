package com.inc.polymorphism;

public class Wolf extends Animal implements Carnivore {
	
	@Override
	void crying() {
		System.out.println("아울~~~");
	}
	
	public boolean hunt(Herbivore herbivore) {
		if(Math.random() > 0.7) {
			herbivore.setAlive(false);
			return true;
		}else {
			return false;
		}
	}
	
}
