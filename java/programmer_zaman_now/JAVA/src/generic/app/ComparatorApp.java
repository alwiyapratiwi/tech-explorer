package generic.app;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

public class ComparatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = {
				new Person("Alwiya", "Indonesia"),
				new Person("Pratiwi", "Indonesia"),
				new Person("Orang", "Indonesia")
			};
		
//		Comparator untuk contohnya melakukan pengurutan dimana classnya yang akan di comparasi tidak bisa dirubah lagi
			
		Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};

		Arrays.sort(people, comparator);
		
		System.out.println(Arrays.toString(people));
	}

}
