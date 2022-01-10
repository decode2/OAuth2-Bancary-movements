package com.example.curso.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.User;

public interface IUserDao extends CrudRepository<User, Long>{
	
	public User findByUsername(String username);

}
