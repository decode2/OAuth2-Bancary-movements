package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.User;

public interface IUserService {
	
	public List<User> findAll();
	
	public void save (User user);
	
	public User findById(Long id);
}
