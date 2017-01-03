package com.adneom.trm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.adneom.trm.domain.BusinessManager;
import com.adneom.trm.domain.Client;
import com.adneom.trm.domain.Consultant;

@SpringBootApplication
@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.adneom.trm"})
public class Application extends RepositoryRestConfigurerAdapter {
	
	public static void main (String[] args)  throws Exception{
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Consultant.class);
        config.exposeIdsFor(Client.class);
        config.exposeIdsFor(BusinessManager.class);
        
    }
}
