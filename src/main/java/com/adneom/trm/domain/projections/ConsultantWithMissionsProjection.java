package com.adneom.trm.domain.projections;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.adneom.trm.domain.BusinessManager;
import com.adneom.trm.domain.Consultant;
import com.adneom.trm.domain.Mission;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * When the missions should be returned again separately, this interface can be used to retrieve
 * the consultants with the mission information immediately returned in the response.
 * The call would look as follows : 
 * 		http://[ip]:8080/consultants?projection=with_missions
 * or, for only one consultant : 
 * 		http://[ip]:8080/consultants/1?projection=with_missions
 * 
 * In order to include all the fields of the consultant, each property getter should be added in this
 * interface. It will require some extra effort in maintainability of the code. Probably there is a
 * better solution out there.
 * 
 * @author Els De Swaef
 */
@Projection(name = "with_missions", types=Consultant.class)
public interface ConsultantWithMissionsProjection {

	public Integer getId();
	public String getName();
	public String getEmail();
	public String getInitials();
	
	public String getSkills();
	public String getContact();
	@JsonProperty("package")
	public Integer getPackag();
	public String getHr();
	public String getLanguages();
	public Boolean getHasCar();
	public Boolean getInternal();

	public BusinessManager getBusinessManager();
	public Integer getBusinessManagerId();
	
	public List<Mission> getMissions();
}
