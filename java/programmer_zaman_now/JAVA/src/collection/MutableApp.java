package collection;

import collection.data.Person;

public class MutableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Alwiya");
		
		person.addHobby("Game");
		person.addHobby("Badminton");
		
		for( var hobby : person.getHobbies()) {
			System.out.println(hobby);
		}

	}

}
