package oop;

import java.util.Scanner;

class PersonApp {

	public static void main(String[] args) {
		
		var person1 = new Person("Zayn", "Tapsel");
//		person1.name = "Alwiya";
//		person1.address = "Sumatera Utara";
//		person1.country = "Belanda";  -> ERROR karena final
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);
		
		person1.sayHello("Alwiya");
		
		Person person2 = new Person("Danish");
//		person2.name = "Kim Taehyung";
//		person2.address = "Korea";
		
//		System.out.println(person2.name);
//		System.out.println(person2.address);
		person2.sayHello("haha");
		
		Person person3;
		person3 = new Person();
		person3.name = "Kiwkiw";
//		System.out.println(person3.name);
		person3.sayHello("ayaya");
		
//		System.out.println(person1.name + person2.address + person3.name);
		
		person1.sayHello("Uy");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nama person 1 : ");
		person1.name = scan.nextLine();
		person1.sayHello("UUyy");
		
		person1.sayHello();

	}

}
