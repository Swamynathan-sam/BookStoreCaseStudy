package com.cg.exceptions;

public class BookdetailsAlreadyFoundException extends RuntimeException {
	/**
	 *
	 */

   public static final long serialVersionUID = 1L;

   public static String message = "Id Already found";

   public BookdetailsAlreadyFoundException() {
       super(message);

   }

   public String getMessage() {

       return message;
   }

   public BookdetailsAlreadyFoundException(String message) {
       super(message);
       // TODO Auto-generated constructor stub
   } 
}
