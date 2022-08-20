package com.vinod.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.dao.UserRepository;
import com.vinod.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User getUser(int id) {
		User user = userRepository.getUser(id);
		 
		if(Objects.nonNull(user)) {
			String name = user.getFirstName();		
			user.setFirstName("Hello " + name);
		}
		
		return user;
	}
}
