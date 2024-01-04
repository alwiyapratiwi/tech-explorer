package generic.app;

import generic.GenericClass;

public class ContravariantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Contravariant -> bisa melakukan subtitusi supertype(parent) dengan subtype(child)
//		kata kunci -> <? super String>
		
		GenericClass<Object> objectGenericClass = new GenericClass<>("Alwi");
		objectGenericClass.setData(100);
		
		GenericClass<? super String> genericClass = objectGenericClass;
		
		process(objectGenericClass);
		System.out.println(objectGenericClass.getData());
		
//		System.out.println(genericClass.getData());

	}

	public static void process(GenericClass<? super String> genericClass) {
		Object value = genericClass.getData();
		System.out.println("Process parameter " + value);
		
		genericClass.setData("Alwiya");
	}
}
