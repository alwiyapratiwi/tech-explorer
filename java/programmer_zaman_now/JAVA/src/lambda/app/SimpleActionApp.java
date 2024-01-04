package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Annonymous Class
//		SimpleAction simpleAction = new SimpleAction() {
//
//			@Override
//			public String action() {
//				// TODO Auto-generated method stub
//				return "Alwi";
//			}
//			
//		};
		
//		System.out.println(simpleAction.action());
		
//		LAMBDA
//		SimpleAction simpleAction2 = () -> {
//			return "Alwi";
//		};
		
//		System.out.println(simpleAction2.action());
		
//		SimpleAction simpleAction = (String name) -> {
//			return "Alwi";
//		};
//		
//		System.out.println(simpleAction.action(""));
		
//		SimpleAction simpleAction1 = (String value) -> {
//			return "Hello " + value;
//		};
//		
//		SimpleAction simpleAction2 = (name) -> {
//			return "Hello " + name;
//		};
		
//		LAMBDA TANPA BLOK
		SimpleAction simpleAction1 = (String value) -> "Hello " + value;
		
		SimpleAction simpleAction2 = (value) -> "Hello " + value;
		
		SimpleAction simpleAction3 = value -> "Hello " + value;

	}

}
