package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> one = Collections.singletonList("Satu");
		List<String> empty = Collections.emptyList();
		
		List<String> mutable = new ArrayList<>();
		mutable.add("Alwi");
		mutable.add("Alwiyaa");
		List<String> immutable = Collections.unmodifiableList(mutable);
		
		List<String> elements = List.of("Alwi", "Alwiya", "Pratiwi");
//		elements.add("Aaa");

	}

}
