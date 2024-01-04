package standard_classes;

import java.util.StringJoiner;

public class JoinerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		joiner.add("alwiya");
		joiner.add("pratiwi");
		
		String result = joiner.toString();
		System.out.println(result);

	}

}
