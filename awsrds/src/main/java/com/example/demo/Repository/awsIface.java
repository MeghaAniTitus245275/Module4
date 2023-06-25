package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.awsentity;
@Repository
public interface awsIface extends JpaRepository<awsentity,Integer>{

	
}
