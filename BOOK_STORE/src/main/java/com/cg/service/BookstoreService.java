package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.exceptions.BookstoreAlreadyFoundException;
import com.cg.exceptions.BookstoreNotFoundException;
import com.cg.model.Bookstore;
import com.cg.repository.BookstoreRepository;

@Service
@Component
public class BookstoreService implements BookstoreInterface {
	
	private BookstoreRepository bookstoreRepository;
	BookstoreService bookstoreservice;

	@Autowired
	public BookstoreService(BookstoreRepository bookstoreRepository) {
		super();
		this.bookstoreRepository = bookstoreRepository;
	}

	@Override
	public Bookstore addBookstore(Bookstore bookstore) {
		System.out.println("Times");
		if (bookstoreRepository.findById(bookstore.getId())==null) {
			bookstoreRepository.save(bookstore);
			System.out.println("");
			return bookstore;
		}
		System.out.println("Error");
		throw new BookstoreAlreadyFoundException();
	}

	@Override
	public String deleteBookstore(int id) {
		if (bookstoreRepository.findById(id)!= null) {
			bookstoreRepository.deleteById(id);
			return " id deleted";
		}
		throw new BookstoreAlreadyFoundException();
	}

	@Override
	public Bookstore update(Bookstore bookstore) {
		Bookstore bookstore2 = bookstoreRepository.findById(bookstore.getId());
		if(bookstore2!=null) {
			
			if(bookstore.getBookstore_name()==null || bookstore.getBookstore_name()==""){
				bookstore.setBookstore_name(bookstore2.getBookstore_name());
		}
			
			if(bookstore.getBookstore_address()==null || bookstore.getBookstore_address()==""){
				bookstore.setBookstore_address(bookstore2.getBookstore_address());
		}
			
			if(bookstore.getBookstore_nearbylandmark()==null || bookstore.getBookstore_nearbylandmark()==""){
				bookstore.setBookstore_nearbylandmark(bookstore2.getBookstore_nearbylandmark());
		}
		
			
		return bookstoreRepository.save(bookstore);
	}
		throw new BookstoreNotFoundException();
 }

     @Override
     public List<Bookstore> getBookstore() {
	 return (List<Bookstore>) bookstoreRepository.findAll();
  }
	
	 @Override
	 public Bookstore getBookstoreById(int id) {
		System.out.println(id);
		Bookstore findByid = bookstoreRepository.findById(id);
		if(findByid!=null) {
			System.out.println(findByid);
			return findByid;
		}
		throw new BookstoreNotFoundException();
	}
}

	
