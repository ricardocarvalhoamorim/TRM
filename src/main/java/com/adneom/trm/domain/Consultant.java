package com.adneom.trm.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.adneom.trm.base.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "consultant")
public class Consultant extends Person {

	private static final long serialVersionUID = 1932053347734772060L;

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
	
	@OneToMany(mappedBy = "consultant", cascade=CascadeType.ALL, orphanRemoval = true)
	private List<Mission> missions; 
	
	private String skills;
	
	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Integer getBusinessManagerId() {
		return this.businessManager.getId();
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
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (! (obj instanceof Consultant)) {
			return false;
		}
		Consultant other = (Consultant) obj;
		return this.getId().equals(other.getId());
	}
	
	//Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getId().hashCode();
        return result;
    }


}
