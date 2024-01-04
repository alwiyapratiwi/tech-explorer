package oop.application;

import oop.data.HelloWorld;

public class HelloWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		anonymous class
//		tidak bisa re-use jadi buat ulang lagi
		HelloWorld english = new HelloWorld() {

			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}

			public void sayHello(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hello " + name);
			}
			
		};
		
		HelloWorld indonesia = new HelloWorld() {

			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Halo");
			}

			public void sayHello(String name) {
				// TODO Auto-generated method stub
				System.out.println("Halo " + name);
			}
			
		};
		
		english.sayHello();
		english.sayHello("Alwi");
		
		indonesia.sayHello();
		indonesia.sayHello("Alwi");
		
		

	}

}