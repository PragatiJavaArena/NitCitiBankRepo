package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.StudentMgmtService;

public class JdbcTemplateDirectMethodTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentMgmtService service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get the service class object
		service=ctx.getBean("studService",StudentMgmtService.class);
		//invokes the method
		try {
			System.out.println("employee detaile are..."+service.getStudentBySno(102));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}
}
