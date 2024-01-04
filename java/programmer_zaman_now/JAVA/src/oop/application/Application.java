package oop.application;

import oop.data.Product;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product("Mac Book Pro", 30_000_000);
		
		System.out.println(product.name);
//		System.out.println(product.price); karena protected

	}

}
