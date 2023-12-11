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

    @ExceptionHandler(BookdetailsAlreadyFoundException.class)
    public ResponseEntity<Object> handleIdAlreadyFound(BookdetailsAlreadyFoundException exception ,WebRequest request){
        CustomException customException = new CustomException(
                HttpStatus.ALREADY_REPORTED.value(),exception.getMessage(),new Date()
                );
        return new ResponseEntity<>(customException,HttpStatus.ALREADY_REPORTED);

    }

    @ExceptionHandler(BookdetailsNotFoundException.class)
    public ResponseEntity<Object> handleIdAlnotFound(BookdetailsNotFoundException exception ,WebRequest request){
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
