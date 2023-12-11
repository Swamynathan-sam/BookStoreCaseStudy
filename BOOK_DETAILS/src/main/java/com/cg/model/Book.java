package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

@Document(collection = "Book")
public class Book {
@Id
@Positive
private int id;
@NotEmpty(message = " please give book_name")
private String book_name;
@NotEmpty(message = " please give book_author")
private String book_author;
@NotEmpty(message = " please give book_price")
private String book_price;

public Book(int id, String book_name, String book_author, String book_price) {
	super();
	this.id = id;
	this.book_name = book_name;
	this.book_author = book_author;
	this.book_price = book_price;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBook_name() {
	return book_name;
}

public void setBook_name(String book_name) {
	this.book_name = book_name;
}

public String getBook_author() {
	return book_author;
}

public void setBook_author(String book_author) {
	this.book_author = book_author;
}

public String getBook_price() {
	return book_price;
}

public void setBook_price(String book_price) {
	this.book_price = book_price;
}
    public String toString() {                                                                                                                                        
    return "Asset book_name:" +book_name+ "book_author:" +book_author+ "book_price:" +book_price;
}   }                                                                                                                                                                 
