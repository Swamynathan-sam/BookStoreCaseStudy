package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.exceptions.UserdetailsAlreadyFoundException;
import com.cg.exceptions.UserdetailsNotFoundException;
import com.cg.model.User;
import com.cg.repository.userdetailsRepository;

@Service
@Component
public class userdetailsService implements userdetailsInterface {
	
	private userdetailsRepository userRepository;
	userdetailsService assetservice;

	@Autowired
	public userdetailsService(userdetailsRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User	addUser(User user) {
		System.out.println("Times");
		if (userRepository.findByid(user.getId())==null) {
			userRepository.save(user);
			System.out.println("");
			return user;
		}
		System.out.println("Error");
		throw new UserdetailsAlreadyFoundException();
	}

	@Override
	public String deleteUser(int id) {
		if (userRepository.findByid(id)!= null) {
			userRepository.deleteById(id);
			return " id deleted";
		}
		throw new UserdetailsNotFoundException();
	}

	@Override
	public User update(User user) {
		User user2 = userRepository.findByid(user.getId());
		if(user2!=null) {
			
			if(user.getUser_name()==null || user.getUser_name()==""){
				user.setUser_name(user2.getUser_name());
		}
			
			if(user.getBook_purchased()==null || user.getBook_purchased()==""){
				user.setBook_purchased(user2.getBook_purchased());
		}
			
			if(user.getUser_address()==null || user.getUser_address()==""){
				user.setUser_address(user2.getUser_address());
		}
		
			
		return userRepository.save(user);
	}
		throw new UserdetailsNotFoundException();
 }

     @Override
     public List<User> getUser() {
	 return (List<User>) userRepository.findAll();
  }
	
	 @Override
	 public User getUserById(int id) {
		System.out.println(id);
		User findByid = userRepository.findByid(id);
		if(findByid!=null) {
			System.out.println(findByid);
			return findByid;
		}
		throw new UserdetailsNotFoundException();
	}
}
