package com.example.demo1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dept {
	@Id
	@GeneratedValue
	
	private int deptid;
	private  String deptname;
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public Dept(int deptid, String deptname) {
		
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public Dept() {
	
	}
	
	
	

}
