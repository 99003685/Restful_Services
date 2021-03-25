package com.rest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springrest.model.User;
import com.rest.springrest.service.UserService;


@RestController
public class MyController {

	@Autowired
	UserService cs;
	
	//GET-all
	@GetMapping("/User")
	public List<User> getUsers()
	{
		return cs.getUsers();
		
	}
	
	//GET-by id
	@GetMapping("/User/{u_id}")
	public User getUser(@PathVariable long u_id)
	{
		return cs.getUser(u_id) ;
		
	}
	
	//POST-add User
	@PostMapping("/User")
	public User addUser(@RequestBody User cr)
	{
		return cs.addUser(cr);
		
	}
	
	//PUT-updating
	@PutMapping("/User")
	public User updateUser(@PathVariable User cr )
	{
		return cs.updateUser(cr);
		
	}
	//DELETE
	@DeleteMapping("/User/{u_id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long u_id)
	{
		try {
		      cs.deleteUser(u_id);
		      return new ResponseEntity<>(HttpStatus.OK);
		      
		}
		catch(Exception e){
			 
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
	}
}
