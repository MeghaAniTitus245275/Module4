package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.Entity.Dept;

@Repository
public interface DeptRepo extends JpaRepository<Dept,Integer>{

}
