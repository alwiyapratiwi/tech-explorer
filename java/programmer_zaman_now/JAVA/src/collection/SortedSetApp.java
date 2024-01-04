package collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import collection.data.Person;
import collection.data.PersonComparator;

public class SortedSetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		gunakan Comparator
//		reversed -> descending
		SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
		
		people.add(new Person("Alwiya"));
		people.add(new Person("Zayn"));
		people.add(new Person("Danish"));
		
		for(var person:people) {
			System.out.println(person.getName());
		}
		
		SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
		sortedSet.add(new Person("aa"));

	}

}
