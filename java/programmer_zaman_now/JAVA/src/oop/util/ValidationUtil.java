package oop.util;

import oop.data.LoginRequest;
import oop.error.BlankException;
import oop.error.ValidationException;

public class ValidationUtil {
	
	public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
		
		if(loginRequest.getUsername() == null) {
			throw new NullPointerException("Username is null");
		} else if(loginRequest.getUsername().isBlank()) {
			throw new ValidationException("Username is blank");
		} else if(loginRequest.getPassword() == null) {
			throw new NullPointerException("Password is null");
		} else if(loginRequest.getPassword().isBlank()) {
			throw new ValidationException("Password is blank");
		}
		
	}
	
	public static void validateRuntime(LoginRequest loginRequest) {
		
		if(loginRequest.getUsername() == null) {
			throw new NullPointerException("Username is null");
		} else if(loginRequest.getUsername().isBlank()) {
			throw new BlankException("Username is blank");
		} else if(loginRequest.getPassword() == null) {
			throw new NullPointerException("Password is null");
		} else if(loginRequest.getPassword().isBlank()) {
			throw new BlankException("Password is blank");
		}
		
	}

}
