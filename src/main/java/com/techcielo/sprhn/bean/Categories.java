package com.techcielo.sprhn.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categories {
	
	@Id
	@Column(name="CategoryID")
	private Integer id;
	
	@Column(name="CategoryName")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		return id+":"+name;
	}
}
