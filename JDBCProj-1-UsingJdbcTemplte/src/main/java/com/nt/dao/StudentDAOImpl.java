package com.nt.dao;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAOImpl implements StudentDAO {
	private static final String GetStudentBySno="SELECT SNO,SNAME,AVG FROM STUDENT WHERE SNO=?";
	private static final String GET_STUD_NAME_BY_ENO="SELECT SNAME FROM STUDENT WHERE ENO=?";
     
	private JdbcTemplate jt;
	
	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public Map<String,Object> getSingleRecordBySno(int sno) {
		Map<String,Object> studBO=null;
		//use jt
		studBO=jt.queryForMap(GetStudentBySno, sno);
		return studBO;
	}//method


	@Override
	public String getStudentName(int sno) {
		String sname=null;
		sname=jt.queryForObject(GET_STUD_NAME_BY_ENO,String.class,sno);
		return sname;
	}//method

}//class
