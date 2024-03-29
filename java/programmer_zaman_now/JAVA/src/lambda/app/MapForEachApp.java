package lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		map.put("first_name", "Alwiya");
		map.put("last_name", "Pratiwi");
		
//		for loop
		for(var entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
//		annonymous class
		map.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String key, String value) {
				// TODO Auto-generated method stub
				System.out.println(key + ":" + value);	
			}
		});
		
//		lambda
		map.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}
