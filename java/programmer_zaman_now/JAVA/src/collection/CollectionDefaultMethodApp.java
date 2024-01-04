package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		numbers.replaceAll(new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * 10;
			}
			
		});
		
		System.out.println(numbers);
		
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		
		numbers.removeIf(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t > 100;
			}
			
		});
		
		System.out.println(numbers);

	}

}
