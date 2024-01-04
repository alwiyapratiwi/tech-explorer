package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> collection = new  ArrayList<>();
		
		collection.add("Alwiya");
		collection.add("Pratiwi");
		collection.addAll(List.of("Alwiya", "Pratiwi"));
		
		for(var value: collection) {
			System.out.println(value);
		}
		
		System.out.println("\n==REMOVE==");
		collection.remove("Alwiya");
		collection.removeAll(List.of("Alwiya"));
		
		for(var value: collection) {
			System.out.println(value);
		}
		
		System.out.println("\n==CONTAINS (mengecek)==");
		System.out.println(collection.contains("Pratiwi"));
		System.out.println(collection.containsAll(List.of("Pratiwi")));
		
		System.out.println(collection.size());

	}

}
