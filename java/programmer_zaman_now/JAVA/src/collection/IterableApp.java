package collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
	
	public static void main(String[] args) {
		
//		SEMUA COLLECTION YANG BUKAN MAP DI JAVA ITU BISA MENGGUNAKAN FOR EACH
		
		System.out.println("=== ITERABLE ===");
		Iterable<String> names = List.of("Alwiya", "Pratiwi");
		for(var name: names) {
			System.out.println(name);
		}
		
		System.out.println("\n=== ITERATOR ===");
		Iterator<String> iterator = names.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
	}

}
