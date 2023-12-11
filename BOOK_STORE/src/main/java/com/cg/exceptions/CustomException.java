package com.cg.exceptions;

import java.util.Date;

public class CustomException {

	 private int status;
	    private String message;
	    private Date date;

	    public CustomException() {
	        super();
	    }

	    public CustomException(int status, String message, Date date) {
	        super();
	        this.status = status;
	        this.message = message;
	        this.date = date;
	    }

	    public int getStatus() {
	        return status;
	    }

	    public void setStatus(int status) {
	        this.status = status;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    @Override
	    public String toString() {
	        return "CustomException [status=" + status + ", message=" + message + ", date=" + date + "]";
	    }

}
