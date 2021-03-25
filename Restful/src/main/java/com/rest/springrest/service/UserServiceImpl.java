package com.rest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.springrest.dao.UserDAO;
import com.rest.springrest.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO cd;
	
	@Override
	public List<User> getUsers() {
		/*
		 * List<User> li=new ArrayList<>(); li.add(new
		 * User(23,"Ramayan","About Ram")); li.add(new
		 * User(33,"Bhagvad Geeta ","About Krishna")); return li;
		 */
		return cd.findAll();
	}

	@Override
	public User getUser(long c_id) {
		
		/*
		 * User c=null; List<User> li=getUsers();
		 * 
		 * for(User User:li) { if(User.getC_id()==c_id) { c=User; break; } }
		 * return c;
		 */
		return cd.findById(c_id).get();
	}

	@Override
	public User addUser(User cr) {
		
		/*
		 * List<User> li=getUsers(); li.add(cr); return cr;
		 */
		cd.save(cr);
		return cr;
	}

	@Override
	public User updateUser(User cr) {
		/*
		 * List<User> li=getUsers(); li.forEach(e->{ if(e.getC_id()==cr.getC_id()) {
		 * e.setC_name(cr.getC_name()); e.setC_desc(cr.getC_desc()); } }); return cr;
		 */
		cd.save(cr);
		return cr;
	}

	@Override
	public void deleteUser(long c_id) {
		/*
		 * List<User> li=getUsers();
		 * li=li.stream().filter(e->e.getC_id()!=c_id).collect(Collectors.toList());
		 */
		User entity=cd.getOne(c_id);
		cd.delete(entity);
	}

}
