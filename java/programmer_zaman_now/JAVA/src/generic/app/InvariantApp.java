package generic.app;

import generic.GenericClass;

public class InvariantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Invariant -> tidak boleh disubtitusi dengan subtype (child) atau supertype(parent)
//		<String> != <Object>
		
		GenericClass<String> stringGenericClass = new GenericClass<>("Alwiya");
//		doIt(stringGenericClass); // ERROR
//		GenericClass<Object> ObjectGenericClass = stringGenericClass;	// ERROR
		
		GenericClass<Object> objectGenericClass = new GenericClass<>(1000);
//		GenericClass<Integer> integerGenericClass = objectGenericClass; // ERROR
//		doItInteger(objectGenericClass);	// ERROR

	}
	
	public static void doIt(GenericClass<Object> genericClass) {
//		do nothing
	}
	
	public static void doItInteger(GenericClass<Integer> integerGenericClass) {
//		do nothing
	}

}
