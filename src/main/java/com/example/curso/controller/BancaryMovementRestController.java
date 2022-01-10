package com.example.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curso.entity.BancaryMovement;
import com.example.curso.entity.User;
import com.example.curso.service.IBancaryMovementService;

@RestController
@RequestMapping("/api/oauth2")
public class BancaryMovementRestController {

	@Autowired
	private IBancaryMovementService bancaryMovementService;
	
	@GetMapping("bancary_movement")
	public ResponseEntity<?> movements(){
		List<BancaryMovement> bancaryMovements = bancaryMovementService.findAll();
		
		if (bancaryMovements != null) {
			return new ResponseEntity<>(bancaryMovements, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/bancary_movement_user")
	public ResponseEntity<?> movementUser(@RequestBody User user){
		List<BancaryMovement> bancaryMovements = bancaryMovementService.getMovementUser(user.getId());
		
		if (bancaryMovements != null) {
			return new ResponseEntity<>(bancaryMovements, HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}

