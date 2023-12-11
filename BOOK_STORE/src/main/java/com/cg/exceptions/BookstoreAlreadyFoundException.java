package com.cg.exceptions;

public class BookstoreAlreadyFoundException extends RuntimeException{
	/**
	 *
	 */

   public static final long serialVersionUID = 1L;

   public static String message = "Id Already found";

   public BookstoreAlreadyFoundException() {
       super(message);

   }

   public String getMessage() {

       return message;
   }

   public BookstoreAlreadyFoundException(String message) {
       super(message);
       // TODO Auto-generated constructor stub
   }
}

	

