package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = new ArrayList<>();
//		List<String> stringss = new LinkedList<>();
		
		strings.add("Alwiya");
		strings.add("Pratiwi");
		strings.add("Danish");
		strings.add("Zayn");
		
//		stringss.add("Satu");
//		stringss.add("Dua");
		
		strings.set(0, "Programmer");
		strings.remove(1);
		System.out.println(strings.get(0));
		
		System.out.println("===========");
		
		for(var value: strings) {
			System.out.println(value);
		}

	}

}
