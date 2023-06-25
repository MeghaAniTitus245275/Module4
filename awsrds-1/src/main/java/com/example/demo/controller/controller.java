package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.service;

import com.example.demo.entity.entity;

@RestController
@RequestMapping("/api/4.0")
public class controller {
	@Autowired
	private service services;
	
	@PostMapping("/create")
	public String addEmployee(@RequestBody entity entity)
	{
		return services.create(entity);
		
	}

}
