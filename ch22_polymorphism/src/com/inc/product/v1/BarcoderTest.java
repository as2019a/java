package com.inc.product.v1;

public class BarcoderTest {
	public static void main(String[] args) {
		Television tv1 = new Television(100, "UHD TV", 50);
		Television tv2 = new Television(70, "FHD TV", 30);
		
		Laptop laptop1 = new Laptop(130, "Gram", "window");
		Laptop laptop2 = new Laptop(200, "Mackbook", "mac os");
		
		Barcoder barcoder = new Barcoder();
		barcoder.scan(tv1);
		barcoder.scan(tv2);
		barcoder.scan(laptop1);
		barcoder.scan(laptop2);
		barcoder.total();
		
	}
}
