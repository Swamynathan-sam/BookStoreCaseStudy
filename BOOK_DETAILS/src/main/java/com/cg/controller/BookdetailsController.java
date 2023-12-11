package com.cg.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Book;
import com.cg.service.BookdetailsService;


	@CrossOrigin(origins = "*")
	@RestController
	@RequestMapping("/book")	
		public class BookdetailsController {
			@Autowired
			private BookdetailsService bookservice;

			@PostMapping("/addbooks")
			public ResponseEntity<Object> addBook(@RequestBody Book book) {
				System.out.println(book);
			return  new ResponseEntity(bookservice.addBook(book),(HttpStatus.ACCEPTED));
			}
		    
			
			@GetMapping("/findAllBooks")
			public List<Book> getBook() {
				return bookservice.getBook();
			}
			@GetMapping("/findBook/{id}")
	        public Book getBook(@PathVariable int id) {
	            System.out.println(id);
	            return  bookservice.getBookById(id);
	        }
			
			@GetMapping("/")
			String send() {
				return "server is running";
			}

			@DeleteMapping("/delete/{id}")
			public ResponseEntity<Object> deleteBook(@PathVariable int id) {
				System.out.println(id);
				HashMap<String, String> hashMap = new HashMap<String,String>();
				
				if(bookservice.deleteBook(id)!=null)
					hashMap.put("message","id deleted");
				else {
					hashMap.clear();
					hashMap.put("message", "id not delete");
				}
				return new ResponseEntity(hashMap,HttpStatus.OK) ;
			}
	      
			@PutMapping("/update")
			public ResponseEntity<Object> updateNameById(@RequestBody Book book) {
				return new ResponseEntity(bookservice.update(book),HttpStatus.ACCEPTED);
			}

}
	
