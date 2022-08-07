package com.vinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@GetMapping("/user-by-pvariable/{name}")
	public @ResponseBody String getUserNameByPathVariable(@PathVariable("name") String name) {
		System.out.println("VINOD");
		return "Welcome " + name;
	}
	
	@GetMapping("/user-by-rparam")
	public @ResponseBody String getUserNameByRequestParam(@RequestParam("uname") String name) {
		System.out.println("VINOD");
		return "Welcome " + name;
	}
	
	@GetMapping("/add/{b}")
	public @ResponseBody int getAddition(@RequestParam("a") int a, @PathVariable("b") int b) {
	 	return a + b;
	}
	
	@DeleteMapping("/sample/{b}")
	public @ResponseBody String sample(@PathVariable("b") String b) {
	 	return "You are saying -> " + b;
	}
}

//
//C (POST)
//R (GET)
//U (PUT)
//D (DELETE)

//PathVariable
//RequestParam
//RequestBody
