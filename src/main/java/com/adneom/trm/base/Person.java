package com.adneom.trm.base;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.adneom.trm.domain.BusinessManager;
import com.adneom.trm.domain.Consultant;
import com.adneom.trm.domain.Helper;

/**
 * Since {@link Consultant} and {@link BusinessManager} shared some information, this class Person was created.
 * It contains the shared fields, but is not mapped to the database and it cannot be used in queries. 
 * 
 * Warning : For some reason, this class was not allowed to be in the package com.adneom.trm.domain , which is
 * why it is in a separate package. If it was in the same package, hibernate could not map this class.
 * 
 * @author Els De Swaef
 */
@MappedSuperclass
public abstract class Person implements Serializable {

	private static final long serialVersionUID = 1254230897162245246L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInitials() {
		return Helper.getInitials(getName());
	}
	
}
