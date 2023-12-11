package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotEmpty;

@Document(collection = "User")
public class User {
	@Id

	private int id;
	@NotEmpty(message = " please give user_name")
	private String user_name;
	@NotEmpty(message = " please give book_purchased")
	private String book_purchased;
	@NotEmpty(message = " please give user_address")
	private String user_address;

	public User(int id, String user_name, String book_purchased, String user_address) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.book_purchased = book_purchased;
		this.user_address = user_address;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getBook_purchased() {
		return book_purchased;
	}

	public void setBook_purchased(String book_purchased) {
		this.book_purchased = book_purchased;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String toString() {
		return "Asset user_name:" + user_name + "book_purchased:" + book_purchased + "user_address:" + user_address;
	}
}