package standard_classes;

import java.math.BigInteger;

public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		angka yang melebihi kapasitas Long dan Double
//		BigInteger
//		BigDecimal
		
//		add (+) , subtract (-), multiply (*), divide (/), mod (%)
		
//		Long value = 10000000000;
		
		BigInteger a = new BigInteger("1000000000000000");
		BigInteger b = new BigInteger("10000000000000");
		
		BigInteger c = a.add(b);
		System.out.println(c);

	}

}
