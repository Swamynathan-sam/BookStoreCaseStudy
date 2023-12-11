package com.project.registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(value=UserAlreadyExistsException.class)
	public ResponseEntity<Object> exception(UserAlreadyExistsException exception){
		return new ResponseEntity<>("User already exists", HttpStatus.CONFLICT);
	}

 
	@ExceptionHandler(value=PasswordsDoNotMatchException.class)
	public ResponseEntity<Object> exception(PasswordsDoNotMatchException exception){
		return new ResponseEntity<>("Passwords do not match", HttpStatus.CONFLICT);
	}
 
}