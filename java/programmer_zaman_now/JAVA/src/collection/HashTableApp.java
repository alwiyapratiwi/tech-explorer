package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		mirip dengan HashMap, perbedaan menggunakan synchronized artinya thread safe
		
//		yang baru menggunakan ConcurrentHashMap
		
		Map<String, String> map = new Hashtable<>();
		
		map.put("Alwiya", "Alwiya Value");
		map.put("Programmer", "Programmer Value");
		map.put("Pratiwi", "Pratiwi Value");
		
		for(var key : map.keySet()) {
			System.out.println(key);
		}

	}

}
