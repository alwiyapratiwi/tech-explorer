package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		map.put("Alwiya", "Alwiya Value");
		map.put("Programmer", "Programmer Value");
		map.put("Pratiwi", "Pratiwi Value");
		
		map.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String key, String value) {
				// TODO Auto-generated method stub
				System.out.println(key + " : " + value);
			}
			
		});

	}

}
