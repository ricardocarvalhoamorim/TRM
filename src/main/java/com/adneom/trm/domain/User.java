package com.adneom.trm.domain;

import java.io.Serializable;

import javax.persistence.Table;

@Table
public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int Id;
	private String Name;
	private String Email;
	private String Telephone;
	private String Password;
	private String Tokken;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getTokken() {
		return Tokken;
	}
	public void setTokken(String tokken) {
		Tokken = tokken;
	}

}
