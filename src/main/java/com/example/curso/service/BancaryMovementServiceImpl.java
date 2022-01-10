package com.example.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.IBancaryMovementDao;
import com.example.curso.entity.BancaryMovement;

@Service
public class BancaryMovementServiceImpl implements IBancaryMovementService{

	@Autowired
	private IBancaryMovementDao dao;
	
	@Override
	@Transactional(readOnly=true)
	public List<BancaryMovement> findAll() {
		return (List<BancaryMovement>) dao.findAll();
	}

	@Override
	@Transactional
	public void save(BancaryMovement bancaryMovement) {
		dao.save(bancaryMovement);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<BancaryMovement> getMovementUser(Long id) {
		return (List<BancaryMovement>) dao.findByUserId(id);
	}

}
