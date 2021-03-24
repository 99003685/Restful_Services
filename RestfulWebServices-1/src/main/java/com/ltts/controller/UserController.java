package com.ltts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Userrepository.UserRepository;
import com.ltts.model.User;

@RestController
public class UserController {
	@Autowired
	UserRepository repo;
	
	@GetMapping("users")
	public List<User> getUser()
	{
		List<User> users=(List<User>) repo.findAll();
		
		
		
		
		
		
//		User u1=new User();
//		u1.setName("Pavitra");
//		u1.setAddress("Kanpur");
//		u1.setPhone_number("36565658");
//		
//		users.add(u1);
		
		return users;
		
	}
	
	
	

}
