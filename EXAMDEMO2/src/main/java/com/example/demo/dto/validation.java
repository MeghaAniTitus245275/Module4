package com.example.demo.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class validation {
	

	@NotNull
	@Size(min=4,max=10)
	private String name;
	@Max(56)
	@Min(10)
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public validation(int id, String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public validation() {
		super();
	}
	
	

}
