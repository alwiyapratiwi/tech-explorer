package collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new IdentityHashMap<>();
		
		String key1 = "name.first";
		
		String name = "name";
		String dot = ".";
		String first = "first";
		
		String key2 = name + dot + first;
		
//		pengecekan data menggunakan operator == (reference equality)
//		data dianggap sama jika lokasi memory sama
		System.out.println(key1.equals(key2));
		System.out.println(key1 == key2);
		
		map.put(key1, "Alwi");
		map.put(key2, "Wiya");
		
		System.out.println(map.size());

	}

}
