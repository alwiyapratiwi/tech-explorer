package generic.app;

import generic.GenericClass;

public class CovariantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Covariant -> bisa melakukan subtitusi subtype(child) dengan supertype(parent)
//		(<? extends ParentClass>) // kata kunci  
		
		GenericClass<String> stringGenericClass =  new GenericClass<>("Alwi");
		process(stringGenericClass);
		
//		GenericClass<? extends Object> genericClass = stringGenericClass;
//		System.out.println(genericClass.getData());
		

	}
	
	public static void process(GenericClass<? extends Object> genericClass) {
		System.out.println(genericClass.getData());	// hanya boleh get data
		
//		genericClass.setData(1); // tidak boleh set data, karena berbahaya
	}

}
