package standard_classes;

import java.util.Base64;

public class Base64Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Alwiya Pratiwi";
		
		String encode = Base64.getEncoder().encodeToString(original.getBytes());
		System.out.println(encode);
		
		byte[] bytes = Base64.getDecoder().decode(encode);
		String result = new String(bytes);
		
		System.out.println(result);

	}

}
