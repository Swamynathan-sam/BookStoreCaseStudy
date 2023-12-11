package com.cg.service;


import java.util.List;

import com.cg.model.Book;

public interface BookdetailsInterface {

	Book addBook(Book book);

	String deleteBook(int id);

	Book update(Book book);

	List<Book> getBook();

	Book getBookById(int id);

}
