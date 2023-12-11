package com.cg.exceptions;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
	@ControllerAdvice
	public class CustomExceptionHandler {

	    @ExceptionHandler(BookstoreAlreadyFoundException.class)
	    public ResponseEntity<Object> handleIdAlreadyFound(BookstoreAlreadyFoundException exception ,WebRequest request){
	        CustomException customException = new CustomException(
	                HttpStatus.ALREADY_REPORTED.value(),exception.getMessage(),new Date()
	                );
	        return new ResponseEntity<>(customException,HttpStatus.ALREADY_REPORTED);

	    }

	    @ExceptionHandler(BookstoreNotFoundException.class)
	    public ResponseEntity<Object> handleIdAlnotFound(BookstoreNotFoundException exception ,WebRequest request){
	        CustomException customException = new CustomException(
	                HttpStatus.ALREADY_REPORTED.value(),exception.getMessage(),new Date()
	                );
	        return new ResponseEntity<>(customException,HttpStatus.ALREADY_REPORTED);

	    }

	    @ExceptionHandler(Exception.class)
	    public ResponseEntity<Object> handleParentException(Exception exception ,WebRequest request){
	        CustomException customException = new CustomException(
	                HttpStatus.ALREADY_REPORTED.value(),exception.getMessage(),new Date()
	                );
	        return new ResponseEntity<>(customException,HttpStatus.ALREADY_REPORTED);

	    }
}
