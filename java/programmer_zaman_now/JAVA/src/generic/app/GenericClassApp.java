package generic.app;

import generic.GenericClass;

public class GenericClassApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<String> stringGenericClass = new GenericClass<String>("Alwiya"); 
		GenericClass<Integer> integerGenericClass = new GenericClass<Integer>(100);
		
		String stringValue = stringGenericClass.getData();
		Integer integerValue = integerGenericClass.getData();
		
		System.out.println(stringValue);;
		System.out.println(integerValue);

	}

}
