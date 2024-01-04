package oop;

class Manager extends Employee{
	
	String company;
	
//	constructor di class parent
	Manager(String name) {
		super(name);
	}
	
	Manager(String name, String company) {
		super(name);
		this.company = company;
	}
	
	void sayHello(String name) {
		System.out.println("Heloo " + name + ", My name is Manager " + this.name);
	}

}
