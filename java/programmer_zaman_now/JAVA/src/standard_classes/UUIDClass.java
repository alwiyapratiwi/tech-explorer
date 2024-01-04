package standard_classes;

import java.util.UUID;

public class UUIDClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		UUID -> Universally Unique Identifier
		
		for(int i = 0; i < 100; i++) {
			UUID uuid = UUID.randomUUID();
			String key = uuid.toString();
			System.out.println(key);
		}
		
	}

}
