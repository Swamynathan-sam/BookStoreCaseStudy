package com.cg.exceptions;

public class UserdetailsAlreadyFoundException extends RuntimeException {
	/**
	 *
	 */

   public static final long serialVersionUID = 1L;

   public static String message = "Id Already found";

   public UserdetailsAlreadyFoundException() {
       super(message);

   }

   public String getMessage() {

       return message;
   }

   public UserdetailsAlreadyFoundException(String message) {
       super(message);
       // TODO Auto-generated constructor stub
   }
}

	


