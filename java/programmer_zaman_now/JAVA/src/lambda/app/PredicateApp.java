package lambda.app;

import java.util.function.Predicate;

import javax.management.ValueExp;

public class PredicateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		INTERFACE PREDICATE
		Predicate<String> predicateCheckBlank = value -> value.isBlank();
		
		System.out.println(predicateCheckBlank.test(""));
		System.out.println(predicateCheckBlank.test("Alwiya"));

	}

}
