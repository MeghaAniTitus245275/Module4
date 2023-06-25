package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.book;

@Repository

public interface bookrepository extends JpaRepository<book,Integer> {

}
