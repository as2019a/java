package com.inc.product.v2;

public class Barcoder {
	private Product[] products = new Product[5];
	//Television tv1 = new Television(100, "UHD TV", 50);
	public void scan(Product product) {
		System.out.println("----------띡----------");
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				product.getInfo();
				products[i] = product;
				//break;
				return;
			}
		}
	}
	
	/*public void scan(Laptop laptop) {
		System.out.println("----------띡----------");
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				laptop.getInfo();
				products[i] = laptop;
				//break;
				return;
			}
		}
	}*/
	
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
