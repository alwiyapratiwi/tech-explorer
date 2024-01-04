package generic.app;

import java.util.Arrays;

import generic.Person;

public class ComparableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = {
			new Person("Alwiya", "Indonesia"),
			new Person("Pratiwi", "Indonesia"),
			new Person("Orang", "Indonesia")
		};
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));

	}

}
