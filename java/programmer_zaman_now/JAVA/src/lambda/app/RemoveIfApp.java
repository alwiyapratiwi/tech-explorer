package lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		names.addAll(List.of("Alwiya", "Pratiwi"));
		
//		for loop
		for( var name : names) {
			if(name.length() > 5) {
				names.remove(name);
			}
		}
		
//		Annonymous Class
		names.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String value) {
				// TODO Auto-generated method stub
				return value.length() > 5;
			}
			
		});
		
//		lambda
		names.removeIf(name -> name.length() > 5);
		
		System.out.println(names);
		

	}

}
