package com.rest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.springrest.model.User;



public interface UserDAO extends JpaRepository<User, Long> {

}
