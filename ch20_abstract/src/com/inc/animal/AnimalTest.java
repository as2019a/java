package com.inc.animal;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Cat cat = new Cat();
		cat.age = 10;
		System.out.println(cat.age);
		cat.crying();
		
		Horse horse = new Horse();
		horse.crying();
	}
}
