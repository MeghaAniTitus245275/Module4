package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class book {
	
	@Id
	@GeneratedValue
	private int bookid;
	private String bookname;
	public book(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	public book() {
		super();
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	

}
