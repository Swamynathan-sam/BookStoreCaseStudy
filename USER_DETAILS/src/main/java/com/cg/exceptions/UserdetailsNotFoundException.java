package com.cg.exceptions;

public class UserdetailsNotFoundException extends RuntimeException {
    /**
    *
    */
    public static final long serialVersionUID = 1L;

    public static String message = "Id not found ";

    public UserdetailsNotFoundException() {
        super(message);

    }

    public String getMessage() {

        return message;
    }

    public UserdetailsNotFoundException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

}
