package com.example.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.entity.User;
import com.example.curso.service.IUserService;

@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers(){
		List<User> users = userService.findAll();
		
		if (users != null) {
			return new ResponseEntity<>(users, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping("create_user")
	public ResponseEntity<?> create(@RequestBody User user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		this.userService.save(user);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
