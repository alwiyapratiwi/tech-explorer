 package standard_classes;

public class NumberClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer intValue = 10;
		
	
		Long longValue = intValue.longValue();
		Double doubleValue = longValue.doubleValue();
		Short shortValue = doubleValue.shortValue();
		
		String contoh = "100.10";
		
		double contoh1 = Double.parseDouble(contoh); // primitive
		System.out.println(contoh1);
		Double contohInt = Double.valueOf(contoh); // valueOf -> object
		System.out.println(contohInt);
		
	}

}
