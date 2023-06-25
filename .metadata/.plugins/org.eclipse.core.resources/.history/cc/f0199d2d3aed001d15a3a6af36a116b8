package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.userentity;

@Repository

public interface userrepo  extends JpaRepository<userentity,Integer>{

	userentity findByName(String username);

}
