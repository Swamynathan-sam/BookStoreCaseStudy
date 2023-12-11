package com.cg.exceptions;

public class BookdetailsNotFoundException extends RuntimeException {
    /**
    *
    */
    public static final long serialVersionUID = 1L;

    public static String message = "Id not found ";

    public BookdetailsNotFoundException() {
        super(message);

    }

    public String getMessage() {

        return message;
    }

    public BookdetailsNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub {

	
	}

}
