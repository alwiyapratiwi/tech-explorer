package standard_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Alwiya Pratiwi Now";
		
//		3 karakter, 
//		1. dari A-Z (upper/lower)
//		2. ada karakter a ditengah
//		3. dari A-Z (upper/lower)
		Pattern pattern = Pattern.compile("[a-zA-z]*[a][a-zA-Z]*");
		Matcher matcher =  pattern.matcher(name);
		
		while(matcher.find()) {
			String result = matcher.group();
			System.out.println(result);
		}
	}

}
