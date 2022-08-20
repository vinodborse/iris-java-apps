package com.vinod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.User;
import com.vinod.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@GetMapping("/hello")
	public String hello() {
		return "hello user";
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam("user_id")int id) {
			
		return userService.getUser(id);
	}
}


//pathVariabe :- localhost:8080/user/1

//requestParam :- localhost:8080/user?user_id=1

//localhost:8080/api/user?user_id=1
//loclahost:8080/iris-spriong-boot-app/api/user?user_id=1



//@Component
//@Controller / @RestController
//@Service
//@Repository