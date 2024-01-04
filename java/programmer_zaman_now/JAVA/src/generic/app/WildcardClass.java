package generic.app;

import generic.GenericClass;
import generic.app.MultipleConstraintApp.Manager;

public class WildcardClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(new GenericClass<Integer>(100));
		print(new GenericClass<String>("Alwiya"));
		print(new GenericClass<Manager>(new Manager()));
		
	}
	
	public static void print(GenericClass<?> genericClass) {
		System.out.println(genericClass.getData());
	}

}
