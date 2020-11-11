package com.nt.dao;

import java.util.Map;

public interface StudentDAO {

	 public Map<String,Object> getSingleRecordBySno(int sno);
	 public String getStudentName(int sno);
	 
}
