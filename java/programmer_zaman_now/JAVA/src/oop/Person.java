package oop;

class Person {
	String name;
	String address;
	final String country = "Indonesia";
	
//	constructor
	Person(String name, String address) {
//		name = paramName;
//		address = paramAddress;
//		this merepresentasikan objek saat ini
//		mengatasi variable shadowing 
		this.name = name;
		this.address = address;
	}
	
//	constructor overloading
	Person(String paramName) {
//		manggil constructor pertama
		this(paramName, null);
	}
	
//	constructor overloading
	Person() {
//		manggil constructor kedua
		this(null);
	}
	
	void sayHello() {
		this.sayHello("apapun");
	}
	
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + ", My name is " + this.name);
	}
}
