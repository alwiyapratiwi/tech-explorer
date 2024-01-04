package collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
	
	private String name;
	
	private List<String> hobbies;

	public Person(String name) {
		this.name = name;
		this.hobbies = new ArrayList<>();
	}
	
	public void addHobby(String hobby) {
		hobbies.add(hobby);
	}

	public String getName() {
		return name;
	}

	public List<String> getHobbies() {
//		agar tidak bisa diubah atau konversi ke immutable list
		return Collections.unmodifiableList(hobbies);
	}

	
	
	
	

}
