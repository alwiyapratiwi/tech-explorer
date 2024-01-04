package collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ambil data yang lebih dari key x atau kurang dari key y
		NavigableMap<String, String> map = new TreeMap<>();
		
		map.put("Alwiya", "Alwiya Value");
		map.put("Programmer", "Programmer Value");
		map.put("Pratiwi", "Pratiwi Value");
		
		System.out.println(map.lowerKey("Pratiwi"));
		System.out.println(map.higherKey("Alwiya"));
		System.out.println(map.floorKey("Alwiya"));
		System.out.println(map.lowerKey("Programmer"));
		
//		descending
		NavigableMap<String, String> mapDesc = map.descendingMap();
		for(var key : mapDesc.keySet()) {
			System.out.println(key);
		}
		
//		agar tidak bisa diubah
		NavigableMap<String, String> empty = Collections.emptyNavigableMap();
		NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
		
		mapDesc.put("Ayam", "Ayam");

	}

}
