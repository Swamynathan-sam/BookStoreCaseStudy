package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.User;

public interface userdetailsRepository  extends MongoRepository<User, Integer> {

	public User findByid(int getid);

	

}
