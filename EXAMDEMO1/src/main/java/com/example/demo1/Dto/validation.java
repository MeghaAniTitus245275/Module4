package com.example.demo1.Dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class validation {
	@Size(min=5,max=9)
	@NotNull(message="name cannot be null")
	private String name;
	@Min(18)
	@Max(46)
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
	public validation(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public validation() {
		super();
	}
	
	
}
