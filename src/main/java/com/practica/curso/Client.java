package com.practica.curso;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue
	
	private Long id;

	private String name;
	private String email;
	
	//Getters
	
	public String getId() {
		return String.valueOf(id);
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	//Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
