package com.vigo.restful.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	@NotNull
	@Size(min = 0, max = 100)
	private int id;
	@NotNull
	private String name;

	@NotNull
	private Date date;

	@NotNull
	private String message;
	
	@NotNull
	private int bvn;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, String message,int bvn) {
		
		this.id = id;
		this.name = name;
		this.message = message;
		this.date = new Date();
		this.bvn = bvn;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getBvn() {
		return bvn;
	}

	public void setBvn(int bvn) {
		this.bvn = bvn;
	}

}
