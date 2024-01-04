package standard_classes;

public class StringBufferdanStringBuilder {
	
	public static void main(String[] args) {
//		StringBuilder(kebalikan stringbuffer)
		StringBuilder builder = new StringBuilder();
		builder.append("Alwi");
		builder.append("ya");
		
		String name = builder.toString();
		System.out.println(name);
		
//		StringBuffer(thread safe / paralel) -> lebih lambat
		
	}

}
