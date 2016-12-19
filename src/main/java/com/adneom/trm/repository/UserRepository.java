package com.adneom.trm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.adneom.trm.config.ConfigDBProperties;


@Repository
public class UserRepository {

	//@PersistenceContext(unitName = "test")
	private EntityManager entityManager;
	
	//@PersistenceUnit(name="test")
    //private EntityManagerFactory entityManagerFactory;	
	//EntityManager entityManager = entityManagerFactory.createEntityManager();
	
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
	
	public Boolean Authenticate2(String Name, String Pass){
		/*JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			Object[] params = new Object[]{Name,Pass};
            int number = (int) jdbcTemplate.queryForObject("select count(*) from [User] where name=? AND password=?", params, Integer.class);
            if (number > 0) {
                return true;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		Object[] params = new Object[]{Name,Pass};
		String query="select count(*) from [User] where name=? AND password=?";
		List<?> userDetails =  getHibernateTemplate().find(query, params);
		*/
		
		try{
			  System.out.println("before init manager");
			entityManager=Persistence.createEntityManagerFactory("test").createEntityManager();
			  System.out.println("after init manager");
		
		 Query q = entityManager.createQuery("select count(*) from [User] where name= :name AND password= :pass");
	               
	        q.setParameter("name", Name);
	        q.setParameter("pass", Pass);
		
	        System.out.println("after query fired");
		
		if(q.getResultList().size()>0)
			return true;
		}finally{
			entityManager.close();
		}
		
        return false;
	}
}
