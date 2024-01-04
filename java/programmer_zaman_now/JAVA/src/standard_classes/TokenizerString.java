package standard_classes;

import java.util.StringTokenizer;

public class TokenizerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		memotong string menjadi lebih kecil
		
		String value = "Alwiya Pratiwi";
		
		StringTokenizer token = new StringTokenizer(value, " ");
		
		while(token.hasMoreTokens()) {
			String result = token.nextToken();
			System.out.println(result);
		}

	}

}
