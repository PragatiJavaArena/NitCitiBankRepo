package com.nt.service;

import java.util.Map;

import com.nt.dao.StudentDAO;

public class StudentMgmtServiceImpl implements StudentMgmtService {
	   private StudentDAO dao;
		
	   public StudentMgmtServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	   @Override
     	public Map<String, Object> getStudentBySno(int sno) {
		    return   dao.getSingleRecordBySno(sno);
	  }//method

	@Override
	public String fetchStudentNameByEno(int sno) {
		// TODO Auto-generated method stub
		return null;
	}

}//class
