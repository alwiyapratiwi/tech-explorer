package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = List.of("Alwiya", "Pratiwi", "Programmer");
		
//		konversi object ke array
		Object[] objects = names.toArray();
//		string ke array
		String[] strings = names.toArray(new String[] {});
		
		System.out.println(Arrays.toString(objects));
		System.out.println(Arrays.toString(strings));

	}

}
