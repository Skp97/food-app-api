package com.ty.foodappapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ty.foodappapi.dao.UserDao;
import com.ty.foodappapi.dto.User;
import com.ty.foodappapi.util.ResponseStructure;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public ResponseStructure<User> saveUser(User user){
		User user1=userDao.saveUser(user);
		ResponseStructure<User> responseStructure=new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("SUCESSFULL");
		responseStructure.setData(user1);
		return responseStructure;
	}
	public ResponseStructure<User> getUser(int id){
		User user1=userDao.getUser(id);
		ResponseStructure<User> responseStructure=new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("SUCESSFULL");
		responseStructure.setData(user1);
		return responseStructure;
	}
	
	public ResponseStructure<User> getUsers(int id){
		User user1=userDao.getUsers(id);
		ResponseStructure<User> responseStructure=new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("SUCESSFULL");
		responseStructure.setData(user1);
		return responseStructure;
	}
	
}
