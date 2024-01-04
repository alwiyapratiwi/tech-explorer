package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new HashMap<>();
		
		map.put("Alwiya", "Alwiya Value");
		map.put("Programmer", "Programmer Value");
		map.put("Pratiwi", "Pratiwi Value");
		
//		mengambil key dan value
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for(var entry: entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
