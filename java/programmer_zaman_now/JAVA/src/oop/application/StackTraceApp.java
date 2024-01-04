package oop.application;

public class StackTraceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			String [] names = {
//					"Alwiya", "Pratiwi"
//			};
//			System.out.println(names[100]);
//		} catch (Throwable throwable) {
//			StackTraceElement[] stackTraceElement = throwable.getStackTrace();
//			
//			throwable.printStackTrace();
//			
//		}
		
		try {
			sampleError();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void sampleError() {
		try {
			String [] names = {
					"Alwiya", "Pratiwi"
			};
			
			System.out.println(names[100]);
			
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}

}
