package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.entity;
import com.example.demo.repository.repo;

@Service
public class service {
	
	private repo repo1;

	public String create(entity entity) {
		// TODO Auto-generated method stub
		 repo1.save(entity);
		return "true";
	}

}
