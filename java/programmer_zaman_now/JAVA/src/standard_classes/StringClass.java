package standard_classes;

public class StringClass {
	
	public static void main(String[] args) {
//		String adalah object, memiliki representasi di classnya, ada banyak method yang digunakan pada string
		
		String name = "  Alwiya Pratiwi";
		
		String lowerCase = name.toLowerCase();
		String upperCase = name.toUpperCase();
		String satu = name.trim();
		int str = satu.length();
		
		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(satu);
		System.out.println(str);
		
		if(name.startsWith(" ")) {
			String a = name.trim();
			System.out.println(a.startsWith("Alwiya"));
		}
		System.out.println(name.startsWith("Alwiya"));
		
		String[] names = name.split(" ");
//		System.out.println(names);
		
		for (String value : names) {
			System.out.println(value);
		}
		
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());
		
		
	}

}
