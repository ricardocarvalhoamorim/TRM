package com.adneom.trm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = {"com.adneom.trm"})
public class Application {
	
	public static void main (String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
	}

}
