package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> empty = Collections.emptyMap();
		
		Map<String, String> singleton = Collections.singletonMap("name", "alwi");
		
		Map<String, String> mutable = new HashMap<>();
		mutable.put("name", "alwiya");
		Map<String, String> immutable = Collections.unmodifiableMap(mutable);
		
		Map<String, String> map = Map.of(
			"first", "alwiya",
			"middle", "Programmer",
			"last", "Pratiwi"
		);
		
//		map.put("a", "A");	=> ERROR
				
	}

}
