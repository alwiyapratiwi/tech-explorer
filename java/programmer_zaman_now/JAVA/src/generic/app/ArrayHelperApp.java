package generic.app;

import generic.ArrayHelper;

public class ArrayHelperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"Alwi", "Wiya", "Pratiwi"};
		Integer[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println(ArrayHelper.<String>count(names)); // boleh pake <String> boleh engga
		System.out.println(ArrayHelper.count(numbers));	// sebaikknya engga 

	}

}
