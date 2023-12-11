package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.exceptions.BookdetailsAlreadyFoundException;
import com.cg.exceptions.BookdetailsNotFoundException;
import com.cg.model.Book;
import com.cg.repository.BookdetailsRepository;


	
	@Service
	@Component
	public class BookdetailsService implements BookdetailsInterface {
		private BookdetailsRepository bookRepository;
		BookdetailsService bookservice;

		@Autowired
		public BookdetailsService(BookdetailsRepository bookRepository) {
			super();
			this.bookRepository = bookRepository;
		}

		@Override
		public Book addBook(Book book) {
			System.out.println("Times");
			//If their is no book present in that id
			if (bookRepository.findByid(book.getId())==null) {
				//saves book
				bookRepository.save(book);
				System.out.println("");
				return book;
			}
			System.out.println("Error");
			throw new BookdetailsAlreadyFoundException();
		}

		@Override
		public String deleteBook(int id) {
			//If id is present it deletes the record or else throws exception
			if (bookRepository.findByid(id)!= null) {
				bookRepository.deleteById(id);
				return " id deleted";
			}
			throw new BookdetailsNotFoundException();
		}

		@Override
		public Book update(Book book) {
			Book book2 = bookRepository.findByid(book.getId());
			//If id is present update details
			if(book2!=null) {
				
				if(book.getBook_name()==null || book.getBook_name()==""){
					book.setBook_name(book2.getBook_name());
			}
				
				if(book.getBook_author()==null || book.getBook_author()==""){
					book.setBook_author(book2.getBook_author());
			}
				
				if(book.getBook_price()==null || book.getBook_price()==""){
					book.setBook_price(book2.getBook_price());
			}
				
				
				
			return bookRepository.save(book);
		}
			throw new BookdetailsNotFoundException();
	 }

	     @Override
	     public List<Book> getBook() {
		 return (List<Book>) bookRepository.findAll();
	  }
		 
		 @Override
		 public Book getBookById(int id) {
			System.out.println(id);
			Book findByid = bookRepository.findByid(id);
			if(findByid!=null) {
				System.out.println(findByid);
				return findByid;
			}
			throw new BookdetailsNotFoundException();
		}
}
