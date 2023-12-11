package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;

@Document(collection = "Bookstore")
public class Bookstore {
@Id

private int id;
@NotEmpty(message = " please give bookstore_name")
private String bookstore_name;
@NotEmpty(message = " please give bookstore_address")
private String bookstore_address;
@NotEmpty(message = " please give bookstore_nearbylandmark")
private String bookstore_nearbylandmark;



public Bookstore(int id, String bookstore_name, String bookstore_address, String bookstore_nearbylandmark) {
	super();
	this.id = id;
	this.bookstore_name = bookstore_name;
	this.bookstore_address = bookstore_address;
	this.bookstore_nearbylandmark = bookstore_nearbylandmark;
	
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getBookstore_name() {
	return bookstore_name;
}



public void setBookstore_name(String bookstore_name) {
	this.bookstore_name = bookstore_name;
}



public String getBookstore_address() {
	return bookstore_address;
}



public void setBookstore_address(String bookstore_address) {
	this.bookstore_address = bookstore_address;
}



public String getBookstore_nearbylandmark() {
	return bookstore_nearbylandmark;
}



public void setBookstore_nearbylandmark(String bookstore_nearbylandmark) {
	this.bookstore_nearbylandmark = bookstore_nearbylandmark;
}
public String toString() {
return "Bookstore bookstore_name:" +bookstore_name+ "bookstore_address:" +bookstore_address+ "bookstore_nearbylandmark:" +bookstore_nearbylandmark;
}

	
}
