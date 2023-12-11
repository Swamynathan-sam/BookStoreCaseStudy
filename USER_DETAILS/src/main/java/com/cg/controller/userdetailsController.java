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

import com.cg.model.User;
import com.cg.service.userdetailsService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")	
	public class userdetailsController {
		@Autowired
		private userdetailsService userservice;

		@PostMapping("/adduser")
		public ResponseEntity<Object> addUser(@RequestBody User user) {
			System.out.println(user);
		return  new ResponseEntity(userservice.addUser(user),(HttpStatus.ACCEPTED));
		}
	   
		
		@GetMapping("/findAllUsers")
		public List<User> getUser() {
			return userservice.getUser();
		}
		@GetMapping("/findUser/{id}")
        public User getUser(@PathVariable int id) {
            System.out.println(id);
            return  userservice.getUserById(id);
        }
		
		@GetMapping("/")
		String send() {
			return "server is running";
		}

		@DeleteMapping("/delete/{id}")
		public ResponseEntity<Object> deleteUser(@PathVariable int id) {
			System.out.println(id);
			HashMap<String, String> hashMap = new HashMap<String,String>();
			
			if(userservice.deleteUser(id)!=null)
				hashMap.put("message","id deleted");
			else {
				hashMap.clear();
				hashMap.put("message", "id not delete");
			}
			return new ResponseEntity(hashMap,HttpStatus.OK) ;
		}
      
		@PutMapping("/update")
		public ResponseEntity<Object> updateNameById(@RequestBody User user) {
			return new ResponseEntity(userservice.update(user),HttpStatus.ACCEPTED);
		}


}
