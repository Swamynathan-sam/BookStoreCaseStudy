package com.cg.service;

import java.util.List;

import com.cg.model.User;


public interface userdetailsInterface {

	User addUser(User user);

	String deleteUser(int id);

	User update(User user);

	List<User> getUser();

	User getUserById(int id);

}
