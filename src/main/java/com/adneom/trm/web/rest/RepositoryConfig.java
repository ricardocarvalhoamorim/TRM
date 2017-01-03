package com.adneom.trm.web.rest;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.adneom.trm.domain.BusinessManager;
import com.adneom.trm.domain.Client;
import com.adneom.trm.domain.Consultant;
import com.adneom.trm.domain.Mission;

/**
 * Extra configuration used to return the id's of the domain objects to the front-end
 * 
 * @author Els De Swaef
 */
@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		super.configureRepositoryRestConfiguration(config);
		config.exposeIdsFor(
				BusinessManager.class,
				Client.class,
				Consultant.class,
				Mission.class);
	}
}
