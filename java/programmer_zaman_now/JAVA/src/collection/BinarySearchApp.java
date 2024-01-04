package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(100);
		for(int i =1; i<=1000; i++) {
			list.add(i);
		}
		
//		fitur search dengan implementasi sequential search ( dicetak satu per satu) 
//		hanya bisa dilakukan jika data telah berurutan 
		int index = Collections.binarySearch(list, 333);
		System.out.println(index);
		
		Comparator<String> reverse = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		
		int index2 = Collections.binarySearch(list, 333);
		System.out.println(index2);

	}

}
