package com.nt.service;

import java.util.Map;

public interface StudentMgmtService {

	public Map<String,Object>  getStudentBySno(int sno);
	public String fetchStudentNameByEno(int sno);
}
