package com.adneom.trm.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.adneom.trm.base.Person;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "businessmanager")
public class BusinessManager extends Person {

	private static final long serialVersionUID = -5176533999279186387L;

	@Column(name = "contact")
	private String telephone;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "target")
	private Integer target;
	
	@Column(name = "unit_manager")
	private Boolean unitManager;
	
	@Column(name = "active")
	private Boolean active;
	
	@OneToMany(mappedBy = "businessManager")
	private List<Consultant> consultants;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}

	public Boolean getUnitManager() {
		return unitManager;
	}

	public void setUnitManager(Boolean unitManager) {
		this.unitManager = unitManager;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<Consultant> getConsultants() {
		return consultants;
	}

	public void setConsultants(List<Consultant> consultants) {
		this.consultants = consultants;
	}
}
