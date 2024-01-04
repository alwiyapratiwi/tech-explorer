package lambda.app;

import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayHello("Alwi");
		
		String name = null;
		sayHello(name);

	}
	
	public static void sayHello(String name) {
//		menggunakan lambda 
//		agar terhindar dari nullexception
//		Optional.ofNullable(name)
//			.map(String::toUpperCase)
//			.ifPresentOrElse(
//					value -> System.out.println("Hello " + value),
//						() -> System.out.println("Hello")
//					);
		
		String upperName = Optional.ofNullable(name)
			.map(String::toUpperCase)
			.orElse("TEMAN");
		
		System.out.println("Hello " + upperName);
		
//		Optional<String> optionalName = Optional.ofNullable(name);
//		Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//		optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
		
//		if check null
//		if(name != null) {
//			String upperName = name.toUpperCase();
//			System.out.println("HELLO " + upperName);
//		}
		
	}

}
