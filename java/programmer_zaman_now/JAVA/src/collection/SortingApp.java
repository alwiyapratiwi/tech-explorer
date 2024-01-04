package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.addAll(List.of("Alwiya", "Pratiwi", "Programmer", "Zaman", "Now"));
		
		Collections.sort(list);	// tanpa comparator (ASC)
		
		Comparator<String> reverse = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		};
		
		Collections.sort(list, reverse);
		
		for(var value : list) {
			System.out.println(value);
		}

	}

}
