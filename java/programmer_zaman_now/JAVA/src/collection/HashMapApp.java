package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tidak berurut
		Map<String, String> map = new HashMap();
		map.put("name.first", "Alwiya");
		map.put("name.middle", "Programmer");
		map.put("name.last", "Pratiwi");
		
		System.out.println(map.get("name.first"));
		System.out.println(map.get("name.middle"));
		System.out.println(map.get("name.last"));

	}

}
