package com.nt.service;


import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeOperationsServiceImpl implements EmployeeOperationsService {
	private EmployeeDAO dao;
	

	public EmployeeOperationsServiceImpl(EmployeeDAO dao) {
		System.out.println("EmployeeOperationsServiceImpl.1-param constructor");
			this.dao = dao;
	}


	@Override
	public String register(EmployeeDTO dto) throws Exception {
	
		float grosssalary=0.0f;
		float netsalary =0.0f;
		int count;
		EmployeeBO bo=null;
		
		
		//write b.logic  /service logic
		//calculate gross salary
		grosssalary=dto.getBasicSalary()+(dto.getBasicSalary()*0.3f);
		netsalary=grosssalary-((dto.getBasicSalary())*0.2f);
		//prepared BO class object
		bo=new EmployeeBO();
		
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grosssalary);
		bo.setNetSalary(netsalary);

		//use DAO
		count=dao.insert(bo);
		//process the result
		if(count==0)
			return "Employee registration failed.......";
		else
			return "Employee Registration Done... BasicSalary -->"+dto.getBasicSalary()+"GrossSalary --->"+grosssalary+"NetSalary--->"+netsalary;		
	}

}
