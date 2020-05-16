package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;
@Repository("studDAO")
//@Component("studDAO")
public final class StudentDAOImpl implements StudentDAO {
	
	private static final String INSERT_STUDENT_QUERY="INSERT INTO SPRING_LAYERED_STUDENT VALUES(?,?,?,?,?)";
@Autowired
	private DataSource ds;

	
	
	/*
	 * public StudentDAOImpl(DataSource ds) {
	 * System.out.println("StudentDAOImpl.1-param constructor"); this.ds = ds; }
	 */

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//get pooled JDBC con object using the injected DataSource object
		con=ds.getConnection();
		
		//create JDBC PreparedStatement Object having PreCompiled SQL query
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		
		//set values to query param by gathering BO class object
		
		ps.setString(1,bo.getSname());
		ps.setString(2,bo.getSadd());
		ps.setFloat(3,bo.getTotal());
		ps.setFloat(4,bo.getAvg());
		ps.setString(5,bo.getResult());
		
		//execute the pre-compiled sql query
		
		count=ps.executeUpdate();
		
		
		return count;
	}

}
