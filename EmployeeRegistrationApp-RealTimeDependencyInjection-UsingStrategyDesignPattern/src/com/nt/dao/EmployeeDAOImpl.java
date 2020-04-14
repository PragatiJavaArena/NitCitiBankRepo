package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMPLOYEE_QUERY="INSERT INTO SPRING_LAYERED_EMPLOYEE VALUES(?,?,?,?,?,?)";
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImpl.1-param constructor");
		this.ds = ds;
	}


	@Override
	public int  insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//get the pooled JDBC con object using the injecting DataSource object
		con=ds.getConnection();
		//create JDBC PreparedStatement object having Pre-compiled sql query
		ps=con.prepareStatement(INSERT_EMPLOYEE_QUERY);
		
		//set the value to query param by gathering BO class object
		
		ps.setInt(1,bo.getEno());
		ps.setString(2,bo.getEname());
		ps.setString(3,bo.getEadd());
		ps.setFloat(4,bo.getBasicSalary());
		ps.setFloat(5,bo.getGrossSalary());
		ps.setFloat(6,bo.getNetSalary());
		
		
		//execute the query
		count=ps.executeUpdate();

		return count;
	}

}
