package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class entity {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String desc;
	
	
	public entity() {
		
	}
	
	
	public entity(int id, String name, String desc) {

		this.id = id;
		this.name = name;
		this.desc = desc;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
