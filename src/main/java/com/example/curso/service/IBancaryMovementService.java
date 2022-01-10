package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.BancaryMovement;

public interface IBancaryMovementService {

	public List<BancaryMovement> findAll();
	
	public void save(BancaryMovement bancaryMovement);
	
	public List<BancaryMovement> getMovementUser(Long id);
}
