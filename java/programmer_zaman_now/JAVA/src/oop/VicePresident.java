package oop;

class VicePresident extends Manager{
	
//	constructor di class parent wajib dipanggil di child class
	VicePresident(String name) {
		super(name);
	}
	
	void sayHello(String name) {
		System.out.println("Heloo " + name + ", My name is VP " + this.name);
	}

}
