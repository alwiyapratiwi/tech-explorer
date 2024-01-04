package lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("Alwiya", "Pratiwi");
		
//		for loop
		for(var value : list) {
			System.out.println(value);
		}
		
//		forEach anonymous class
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
			
		});
		
//		lambda
		list.forEach(value -> System.out.println(value));
		
//		lambda method reference
		list.forEach(System.out::println);

	}

}
