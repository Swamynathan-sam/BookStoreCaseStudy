package com.project.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.registration.exception.PasswordsDoNotMatchException;
import com.project.registration.exception.UserAlreadyExistsException;
import com.project.registration.model.User;
import com.project.registration.model.UserInfo;
import com.project.registration.service.UserRegistrationService;

@RestController
@RequestMapping("/Registration")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserRegistrationService userRegistrationService;
	

	
	@PostMapping("/user")
	public UserInfo addUser(@RequestBody User user) throws UserAlreadyExistsException {
		if (!user.getPassword().equals(user.getConfirmpassword())) {
	        throw new PasswordsDoNotMatchException("Passwords do not match");
	    }

		return userRegistrationService.addUser(user);
	}

}
