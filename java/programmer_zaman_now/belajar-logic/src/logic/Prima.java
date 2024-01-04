package logic;

public class Prima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int angka[]  = {1, 2 ,3, 4};
		
		for (int i = 0; i < angka.length; i++) {
            int currentNumber = angka[i];
            boolean isPrimeResult = isPrime(currentNumber);

            if (isPrimeResult) {
                System.out.println(currentNumber + " is a prime number.");
            } else {
                System.out.println(currentNumber + " is not a prime number.");
            }
        }
		
	}
	
	public static Boolean isPrime(int element) {
		if (element <= 1) {
	        return false;
	    }
		
//		for (int i = 2; i <= Math.sqrt(element); i++) {
//            if (element % i == 0) {
//                return false;
//            }
//        }

	    for (int i = 2; i <= element / 2; i++) {
	        if (element % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}

}
