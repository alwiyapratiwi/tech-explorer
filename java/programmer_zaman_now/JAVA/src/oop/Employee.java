package oop;

public class Employee {
	
	String name;
	
	Employee(String name) {
		this.name = name;
	}
	
	void sayHello(String name) {
		System.out.println("Heloo " + name + ", My name is Employee " + this.name);
	}

}
