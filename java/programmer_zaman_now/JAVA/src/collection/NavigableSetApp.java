package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<String> names = new TreeSet<>();
		names.addAll(Set.of("Alwiya", "Pratiwi", "Programmer", "Zaman", "Now"));
		
		NavigableSet<String> namesReverse = names.descendingSet();
//		headSet() -> keatas
		NavigableSet<String> alwi = names.tailSet("Pratiwi", true);
		
		for(var name : alwi) {
			System.out.println(name);
		}
		
		NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//		immutable.add("ups");

	}

}
