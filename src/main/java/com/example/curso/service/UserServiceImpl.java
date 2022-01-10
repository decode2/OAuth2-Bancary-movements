package com.example.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.IUserDao;
import com.example.curso.entity.User;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Usuario no válido");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE ADMIN")));
	}

	@Override
	@Transactional(readOnly=true)
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	@Transactional(readOnly=true)
	public User findById(Long id) {
		return userDao.findById(id).orElse(null);
	}

}
