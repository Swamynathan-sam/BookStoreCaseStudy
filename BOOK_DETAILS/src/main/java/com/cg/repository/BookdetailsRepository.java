package com.cg.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.Book;

public interface BookdetailsRepository extends MongoRepository<Book, Integer> {

	public Book findByid(int getid);

}
