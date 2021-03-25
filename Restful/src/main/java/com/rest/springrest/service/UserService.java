package com.rest.springrest.service;

import java.util.List;

import com.rest.springrest.model.User;

public interface UserService {

	public List<User> getUsers();
	public User getUser(long u_id);
	public User addUser(User cr);
	public User updateUser(User cr);
	public void deleteUser(long u_id);
}
