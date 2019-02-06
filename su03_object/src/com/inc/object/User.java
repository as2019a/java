package com.inc.object;

import javax.xml.ws.Service;

public class User {
	String id;
	Car myCar;
	int money;
	User[] friends;
	
	boolean buyCar(Car car) {
		if(money < car.price) {
			return false;
		}
		myCar = car;
		money -= car.price;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("아이디 : %s, 돈 : %d", id, money);
	}
	
}
