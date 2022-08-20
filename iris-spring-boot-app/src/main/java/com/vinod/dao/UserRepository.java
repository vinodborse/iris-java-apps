package com.vinod.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vinod.model.User;

@Repository
public class UserRepository {

	public User getUser(int id) {
		
		//Code for the DB
		User u1 = new User(1, "Vinod", "Borse", 1234);
		User u2 = new User(2, "Rahul", "Patil", 1212);
		User u3 = new User(3, "Komal", "Patel", 2222);
		User u4 = new User(4, "Radha", "Rani", 4567);
		User u5 = new User(5, "Aliya", "Bhatt", 8765);
		User u6 = new User(6, "Arjun", "Kapoor", 1987);
		
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);
		for (User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
}
