package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Bookstore;

public interface BookstoreRepository extends MongoRepository<Bookstore, Integer> {

	public Bookstore findById(int getid);

}
