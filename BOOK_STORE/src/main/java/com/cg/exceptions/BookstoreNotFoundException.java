package com.cg.exceptions;

public class BookstoreNotFoundException extends RuntimeException {
	/**
    *
    */
    public static final long serialVersionUID = 1L;

    public static String message = "Id not found ";

    public BookstoreNotFoundException() {
        super(message);

    }

    public String getMessage() {

        return message;
    }

    public BookstoreNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

	

}
