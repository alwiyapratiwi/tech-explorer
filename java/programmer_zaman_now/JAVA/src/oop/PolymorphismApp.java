package oop;

public class PolymorphismApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("Alwiya");
		employee.sayHello("Alwi");
		
		employee = new Manager("Zayn");
		employee.sayHello("Za");
		
		employee = new VicePresident("Danish");
		employee.sayHello("Dan");
		
		sayHello(new Employee("Alwi"));
		sayHello(new Manager("Zayn"));
		sayHello(new VicePresident("Danish"));

	}
	
	static void sayHello(Employee employee) {
//		melakukan pengecekan tipe data
		if(employee instanceof VicePresident) {
//			konversi tipe data
			VicePresident vicePresident = (VicePresident) employee;
			System.out.println("Hello VP " + vicePresident.name);
		} else if (employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println("Hello Manager " + manager.name);
		} else {
			System.out.println("Hello " + employee.name);
		}
	}

}
