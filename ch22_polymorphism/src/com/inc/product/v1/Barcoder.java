package com.inc.product.v1;

public class Barcoder {
	private Product[] products = new Product[5];
	
	public void scan(Television tv) {
		System.out.println("----------띡----------");
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				tv.getInfo();
				products[i] = tv;
				//break;
				return;
			}
		}
	}
	
	public void scan(Laptop laptop) {
		System.out.println("----------띡----------");
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				laptop.getInfo();
				products[i] = laptop;
				//break;
				return;
			}
		}
	}
	
	public void total() {
		int totalPrice = 0;
		//products안에 들어있는 상품들의 가격의 총합을 구하는 반복문 코드 작성
		for(Product product : products) {
			if(products == null) {
				break;
			}
			totalPrice += product.getPrice();
					
		}
		System.out.printf("총 합산 가격은 %d원 입니다.\n", totalPrice);
		/*for(int i = 0; i < products.length; i++) {
			total();
		}*/
	}
}
