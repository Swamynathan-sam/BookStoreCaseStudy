package com.project.registration.exception;

public class UserAlreadyExistsException extends Exception {
	
	public String getMessage() {
		return "user is already present";
	}

}
