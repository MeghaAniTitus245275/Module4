package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor(staticName="build")
public class userentity {
	
	@Id
	@GeneratedValue
	
	private int userid;
//	@NotBlank(message="hi")
	
	private String username;
	public userentity(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public userentity() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
