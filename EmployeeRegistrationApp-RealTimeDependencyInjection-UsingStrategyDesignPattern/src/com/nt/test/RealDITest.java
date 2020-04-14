package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		Scanner sc=null;
		EmployeeVO vo=null;
		String result=null;
		
		String eno=null,ename=null,eadd=null,basicsalary=null;
		//create IOC container
		
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get controller class object
		controller=factory.getBean("controller",MainController.class);
		//read inputs 
		sc=new Scanner(System.in);
	    vo=new EmployeeVO();
	    
		System.out.println("enter emp eno");
		eno=sc.next();
		System.out.println("enter emp name");
		ename=sc.next();
		System.out.println("enter emp add");
		eadd=sc.next();
		System.out.println("enter emp basic salary");
	    basicsalary=sc.next();
	    
		//prepare StudentVO class object
	
	    
	    vo.setEno(eno);
	    vo.setEname(ename);
	    vo.setEadd(eadd);
	    vo.setBasicSalary(basicsalary);
	    
	    //invoke method
	    
	    try {
	    	result=controller.handleEmployee(vo);
	    	System.out.println(result);
	    	
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	 	
	}

}
