package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeOperationsServiceImpl;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeOperationsServiceImpl service;
	
	public MainController(EmployeeOperationsServiceImpl service) {
		System.out.println("MainController.1-param constructor");
		this.service = service;
	}




	public String handleEmployee(EmployeeVO vo)throws Exception{
		EmployeeDTO dto=null;
		String result=null;
		
		//convert vo to dto
		dto=new EmployeeDTO();
		dto.setEno(Integer.parseInt(vo.getEno()));
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		result=service.register(dto);
		
		
		
		return result;
	}	
}