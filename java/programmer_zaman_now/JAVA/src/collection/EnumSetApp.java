package collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
	
	public static enum Gender {
		MALE, FEMALE, NOT_MENTION
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Gender> genders = EnumSet.allOf(Gender.class);
		
		for (var gender: genders) {
			System.out.println(gender);
		}

	}

}
