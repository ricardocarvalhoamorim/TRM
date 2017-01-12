package com.adneom.trm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Small test to verify if the database is running where you would expect. 
 * Change servername to test the one you need.
 * 
 * @author Els De Swaef
 */
public class DatabaseTest {
	
	@Test
	public void databaseRunningTest() throws ClassNotFoundException {
		//connect to database
		Class.forName("com.mysql.jdbc.Driver");
		String serverName = "192.168.1.59";
		String portNumber = "3306";
		String sid = "adneom";
		String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + sid;
		String username = "adn_user_";
		String password = "adneoMMM1234567!!";
		try {
			@SuppressWarnings("unused")
			Connection conn = DriverManager.getConnection(url, username, password);
			assertTrue(true);
		} catch (SQLException e) {
			e.printStackTrace();
			assertTrue(false); // There was an error connecting to the database
		}
	}
}
