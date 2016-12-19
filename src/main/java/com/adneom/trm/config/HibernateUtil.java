package com.adneom.trm.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import com.adneom.trm.config.ConfigDBProperties;

import javax.sql.DataSource;


public class HibernateUtil {

	
	/* @Bean(name="SessionFactory")
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(new String[] { "com.adneom.trm" });
	        return sessionFactory;
	     }
	 
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(ConfigDBProperties.JDBC_DRIVER);
	        dataSource.setUrl(ConfigDBProperties.DB_URL);
	        dataSource.setUsername(ConfigDBProperties.USER);
	        dataSource.setPassword(ConfigDBProperties.PASS);
	        return dataSource;
	    }*/

}