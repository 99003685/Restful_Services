package com.ltts.Userrepository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
