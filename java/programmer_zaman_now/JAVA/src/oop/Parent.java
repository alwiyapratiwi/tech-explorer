package oop;

class Parent {
	String name;
	
	void doIt() {
		System.out.println("Do it in Parent");
	}
}

class Child extends Parent {
//	variable hiding
	String name;
	
//	method overriding
	void doIt() {
		System.out.println("Do it in Child " + name);
		System.out.println("Parent name is " + super.name);
	}
	
}