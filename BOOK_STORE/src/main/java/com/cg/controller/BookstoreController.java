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

import com.cg.model.Bookstore;
import com.cg.service.BookstoreService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bookstore")	
	public class BookstoreController {
		@Autowired
		private BookstoreService bookstoreservice;

		@PostMapping("/addbookstore")
		public ResponseEntity<Object> addBookstore(@RequestBody Bookstore bookstore) {
			System.out.println(bookstore);
		return  new ResponseEntity(bookstoreservice.addBookstore(bookstore),(HttpStatus.ACCEPTED));
		}
	   
		
		@GetMapping("/findAllBookstores")
		public List<Bookstore> getBookstore() {
			return bookstoreservice.getBookstore();
		}
		@GetMapping("/findBookstore/{id}")
        public Bookstore getBookstore(@PathVariable int id) {
            System.out.println(id);
            return  bookstoreservice.getBookstoreById(id);
        }
		
		@GetMapping("/")
		String send() {
			return "server is running";
		}

		@DeleteMapping("/delete/{id}")
		public ResponseEntity<Object> deleteAsset(@PathVariable int id) {
			System.out.println(id);
			HashMap<String, String> hashMap = new HashMap<String,String>();
			
			if(bookstoreservice.deleteBookstore(id)!=null)
				hashMap.put("message","id deleted");
			else {
				hashMap.clear();
				hashMap.put("message", "id not delete");
			}
			return new ResponseEntity(hashMap,HttpStatus.OK) ;
		}
      
		@PutMapping("/update")
		public ResponseEntity<Object> updateNameById(@RequestBody Bookstore bookstore) {
			return new ResponseEntity(bookstoreservice.update(bookstore),HttpStatus.ACCEPTED);
		}
}
	