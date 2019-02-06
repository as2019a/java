package com.inc.product.v1;

public abstract class Product {
	int price;
	String name;
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void getInfo() {
		System.out.printf("가격 : %d, 제품명 : %s\n", price, name);
	}
	
}







