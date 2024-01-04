package standard_classes;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// manipulasi array
		
		int[] numbers = {
				4, 13, 6, 3, 99, 756, 54, 9, 366
		};
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 54));
		
		int[] result = Arrays.copyOf(numbers, 5);
		int[] result2 = Arrays.copyOfRange(numbers, 5, 8);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}

}
