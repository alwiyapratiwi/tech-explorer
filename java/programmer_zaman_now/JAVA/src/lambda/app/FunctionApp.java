package lambda.app;

import java.util.function.Function;

public class FunctionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		INTERFACE FUNCTION -> butuh ngirim parameter dan juga butuh nerima data dari hasil methodnya
		
//		Function<Parameter, Result> / <T, R>
		Function<String, Integer> functionLength = new Function<String, Integer>() {

			@Override
			public Integer apply(String value) {
				// TODO Auto-generated method stub
				return value.length();
			}
		};
		
		System.out.println(functionLength.apply("Alwi"));
		
		Function<String, Integer> functionLength1 = value -> value.length();
		
		System.out.println(functionLength1.apply("Alwiya"));
		

	}

}
