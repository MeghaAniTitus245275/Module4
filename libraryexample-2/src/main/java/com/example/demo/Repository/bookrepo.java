package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.bookentity;

@Repository
public interface bookrepo extends JpaRepository<bookentity,Integer>{

}
