package com.example.curso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.BancaryMovement;

public interface IBancaryMovementDao extends CrudRepository<BancaryMovement, Long>{
	
	public List<BancaryMovement> findByUserId(Long id);

}
