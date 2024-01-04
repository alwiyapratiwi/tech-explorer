package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
	
	public static enum Level {
		FREE, STANDARD, PREMIUM, VIP
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Level, String> map = new EnumMap<Level, String>(Level.class);
		
		map.put(Level.FREE, "Alwi");
		map.put(Level.VIP, "Pratiwi");
		
		for(var key : map.keySet()) {
			System.out.println(map.get(key));
		}

	}

}
