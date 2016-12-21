package com.adneom.trm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.adneom.trm.config.ConfigDBProperties;


@Repository
public class UserRepositoryy {

	
	
	public Boolean Authenticate(String Name, String Pass){
		String stmt= "SELECT id FROM [User] "
				+ "WHERE name = '" +Name+ "' AND password = '"+Pass+"'";
		System.out.println(Name +" "+Pass);
		Connection conn=null;
		try{
		 conn= ConfigDBProperties.openConnect();
		
		PreparedStatement ps= conn.prepareStatement(stmt);
		 
		ResultSet rs=ps.executeQuery(); 
		
		if(rs!=null ){
			System.out.println("in if");
			
				System.out.println("before if");
				if(rs.next()){
					return true;
				}
		}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			finally{		    
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");			
		
		return false;
	}
	
	
}
