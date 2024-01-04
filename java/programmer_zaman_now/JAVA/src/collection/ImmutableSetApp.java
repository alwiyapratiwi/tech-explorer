package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> empty = Collections.emptySet();
		Set<String> one = Collections.singleton("Alwiyaa");
		
		Set<String> mutable = new HashSet<>();
		mutable.add("Alwi");
		mutable.add("Alwiya");
		Set<String> immutable = Collections.unmodifiableSet(mutable);
		
		Set<String> set = Set.of("Alwiii", "Wiyaaa");
		
//		set.add("All"); // ERROR

	}

}
