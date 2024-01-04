package lambda.app;

import java.util.function.Consumer;

public class CosumerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String value) {
				// TODO Auto-generated method stub
				
				System.out.println(value);
				
			}
			
		};
		
//		INTERFACE CONSUMER -> Lambda untuk menerima sebuah data dari parameter
//		LAMBDA
		Consumer<String> consumer1 = value -> System.out.println(value);
		
		consumer1.accept("Alwiya Pratiwi");

	}

}
