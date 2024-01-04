package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.addAll(List.of("Alwiya", "Programmer", "Pratiwi", "Zaman", "Now"));
		
		System.out.println(list);
		
//		class yang berisikan utility static method untuk membantu kita menggunakan Java Collection
//		reverse-> membalikkan
		Collections.reverse(list);
		System.out.println(list);
		
//		shuffle-> mengacak
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.swap(list, 0, 4);
		System.out.println(list);

	}

}
