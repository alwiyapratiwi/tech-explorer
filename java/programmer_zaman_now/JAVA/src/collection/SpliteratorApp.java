package collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("Alwiya", "Programmer", "Pratiwi", "Zaman", "Now", "Last");
		
//		melakukan partisi data collection
//		biasanya digunakan ketika akan memproses collection dalam jumlah besar, agar lebih cepat di split
		Spliterator<String> spliterator1 = list.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		Spliterator<String> spliterator3 = spliterator2.trySplit();
		
		System.out.println(spliterator1.estimateSize());
		System.out.println(spliterator2.estimateSize());
		System.out.println(spliterator3.estimateSize());
		
		spliterator1.forEachRemaining(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		spliterator2.forEachRemaining(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});

	}

}
