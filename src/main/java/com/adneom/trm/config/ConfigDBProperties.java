package com.adneom.trm.config;

import java.io.OutputStream;
import java.util.Properties;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class ConfigDBProperties {
	
		   // JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  
		   static final String DB_URL = "jdbc:sqlserver://tri-server.database.windows.net:1433;DatabaseName=TRM;";

		   //  Database credentials
		   static final String USER = "abrasseur";
		   static final String PASS = "Adneom4Life";
		   
		   static final String FULL_URL = "jdbc:sqlserver://tri-server.database.windows.net:1433;database=TRM;user=abrasseur@tri-server;password=Adneom4Life;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
		   
		   public static Connection openConnect() {
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      return  DriverManager.getConnection(DB_URL,USER,PASS);
		      //STEP 6: Clean-up environment	
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		   return null;
		}//end main	
		}//end FirstExample