package com.ty.foodappapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.foodappapi.dto.User;
import com.ty.foodappapi.service.UserService;
import com.ty.foodappapi.util.ResponseStructure;

@RestController
public class UserCotroller {
	@Autowired
	UserService userService;
	@PostMapping("/users")
	public ResponseStructure<User> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	@GetMapping("/users/{id}")
	public ResponseStructure<User> getUser(@PathVariable int id ){
		return userService.getUser(id);
	}
	@GetMapping("/users/{id}")
	public ResponseStructure<User> getUsers(@PathVariable int id ){
		return userService.getUsers(id);
	}
	
}
