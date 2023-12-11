package com.cg.service;

import java.util.List;

import com.cg.model.Bookstore;

public interface BookstoreInterface {

	String deleteBookstore(int id);

	List<Bookstore> getBookstore();
	 public Bookstore getBookstoreById(int id);
	 public Bookstore update(Bookstore bookstore) ;
	 public Bookstore addBookstore(Bookstore bookstore);

}
