package lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import lambda.util.StringUtil;

public class MethodReferenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Method Reference Static
//		Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
		
		Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;
		
		System.out.println(predicateIsLowerCase.test("a"));
		System.out.println(predicateIsLowerCase.test("B"));
		
//		Method Reference di Parameter
		
		Function<String, String> functionUpper = String::toUpperCase;
		System.out.println(functionUpper.apply("alwi"));
		
	}
	
//	Method Reference Object
	public void run1() {
		MethodReferenceApp app = new MethodReferenceApp();
		Predicate<String> predicateIsLowerCase = app::isLowerCase;
		
		System.out.println(predicateIsLowerCase.test("a"));
		System.out.println(predicateIsLowerCase.test("A"));
	}
	
//	Method Reference Non Static
	public void run() {
//		Predicate<String> predicateIsLowerCase = value -> MethodReferenceApp.this.isLowerCase(value);
		
		Predicate<String> predicateIsLowerCase = this::isLowerCase;
		
		System.out.println(predicateIsLowerCase.test("a"));
		System.out.println(predicateIsLowerCase.test("A"));
	}
	
//	Method Reference Non Static
	public boolean isLowerCase(String value) {
		for(var c : value.toCharArray()) {
			if(!Character.isLowerCase(c)) {
				return false;
			}
		}
		return true;
	}

}
