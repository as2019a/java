package com.inc.product.v2;

public class Television extends Product {
	
	private int size;
	
	public Television(int price, String name, int size) {
		super(price, name);
		this.size = size;
	}
	
	/*public Television(int price, String name, int size) {
		super(price, name);
		this.size = size;
	}*/
	
	
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.printf("사이즈 : %s\n", size);
		
	}

	/*@Override
	public int getInfo() {
		return super.getInfo();
		System.out.printf("사이즈 : %s\n", size);
	}*/
	
}
