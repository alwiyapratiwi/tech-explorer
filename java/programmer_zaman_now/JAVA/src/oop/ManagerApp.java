package oop;

public class ManagerApp {

	public static void main(String[] args) {
		
		var manager = new Manager("Manager 1");
		manager.name ="Alwiya";
		manager.sayHello("Alwi");
		
		var vp = new VicePresident("Manager 2");
		vp.name = "Zayn";
		vp.sayHello("danish");
		

	}

}
