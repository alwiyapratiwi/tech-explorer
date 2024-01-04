package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> names = new HashSet<>();	// tidak berurut
		Set<String> names = new LinkedHashSet<>();  // berurut
		
		names.add("Alwiya");
		names.add("Pratiwi");
		names.add("Alwiya");
		names.add("Programmer");
		
		for(var name:names ) {
			System.out.println(name);
		}

	}

}
