package com.example.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FTTIssueBase;
import com.example.demo.repositories.FTTIssueBaseRepository;
@Service
public class AssetImpl {
	@Autowired
	FTTIssueBaseRepository repo;
	
	//@Override
	public Optional<FTTIssueBase> findById(String id) {

		return repo.findById(id);
	}

}
