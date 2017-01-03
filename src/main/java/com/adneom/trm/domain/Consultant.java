package com.adneom.trm.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "consultant")
public class Consultant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1932053347734772060L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String contact;
	@Column(name = "package")
	private Integer packag;
	private String hr;
	private String languages;
	private Boolean hasCar;
	private Boolean internal;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "bm_id")
	private BusinessManager businessManager;
	// TODO ELS: include businessmanager name  - transient property
	@OneToMany(mappedBy = "consultant")
	private List<Mission> missions; //TODO ELS also delete mission when consultant is deleted
	@Transient //field will not be mapped to the DB
	private String initials;



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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@JsonProperty("package")
	public Integer getPackag() {
		return packag;
	}

	public void setPackag(Integer packag) {
		this.packag = packag;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String lng) {
		this.languages = lng;
	}

	public Boolean getHasCar() {
		return hasCar;
	}

	public void setHasCar(Boolean hasCar) {
		this.hasCar = hasCar;
	}

	public Boolean getInternal() {
		return internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	public BusinessManager getBusinessManager() {
		return businessManager;
	}

	public void setBusinessManager(BusinessManager businessManager) {
		this.businessManager = businessManager;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public String getInitials() {
		return Helper.getInitials(getName());
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

}
