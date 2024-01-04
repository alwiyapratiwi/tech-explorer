package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		berurut
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("first", "Alwi");
		map.put("last", "Pratiwi");
		map.put("middle", "Programmer");
		
		Set<String> keys = map.keySet();
		for(var key : keys) {
			System.out.println(key);
		}

	}

}
