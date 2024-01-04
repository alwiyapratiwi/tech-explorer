package oop.application;

import oop.data.LoginRequest;
import oop.error.ValidationException;
import oop.util.ValidationUtil;

public class ValidationApp {
	
	public static void main(String[] args) {
		
		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setUsername(null);
		loginRequest.setPassword("a");
		
//		try {
//			ValidationUtil.validate(loginRequest);
//			System.out.println("Data Valid");
//		} catch (ValidationException e) {
//			System.out.println("Data tidak valid : " + e.getMessage());
//		} catch (NullPointerException e) {
//			System.out.println("Data null : " + e.getMessage());
//		}
		
//		1. checked exception (wajib try catch)
		try {
			ValidationUtil.validate(loginRequest);
			System.out.println("Data Valid");
		} catch (ValidationException | NullPointerException e) {
			System.out.println("Pesan error : " + e.getMessage());
		} finally {
			System.out.println("selalu dieksekusi");
		}
		
//		2. runtime exception (tidak wajib try catch, tapi disarankan try catch, jika tidak program akan berhenti)
		LoginRequest loginRequest2 = new LoginRequest();
		loginRequest2.setUsername(null);
		loginRequest2.setPassword("a");
		
		ValidationUtil.validateRuntime(loginRequest2);
		
//		3. error
		
	}

}
