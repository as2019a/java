package com.inc.product.v2;

public class Barcoder {
	private Product[] products = new Product[5];

	public void scan(Product product) {
		System.out.println("-------띡-------");
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				product.getInfo();
				products[i] = product;
				return;
			}
		}
	}

	
	public void total() {
		int totalPrice = 0;
		//products안에 들어있는 상품들의 가격의 총합을 구하는 반복문
		for(Product product : products) {
			if(product == null) {
				break;
			}
			totalPrice += product.getPrice();
		}
		System.out.printf("총 합산 가격은 %d원 입니다.\n", totalPrice);
	}
}






