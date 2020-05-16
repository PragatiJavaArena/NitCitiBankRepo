package com.nt.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealTimeDITest {

	public static void main(String[] args) {
	
		ApplicationContext ctx=null;
		MainController controller=null;
		StudentVO vo=null;
		Scanner sc=null;
		String result=null;
		
		String sname=null,sadd=null,m1=null,m2=null,m3=null;
		//create IOC container
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get controller class object
		controller=ctx.getBean("controller",MainController.class);
		//read inputs 
		vo=new StudentVO();
		sc=new Scanner(System.in);
		
		System.out.println("enter student name");
		sname=sc.next();
		System.out.println("enter student add");
		sadd=sc.next();
		System.out.println("enter student mark1");
		m1=sc.next();
		System.out.println("enter student mark2");
		m2=sc.next();
		System.out.println("enter student mark3");
		m3=sc.next();
		//prepare StudentVO class object
		
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		//invoke method
		
		try {
		result=controller.handleStudent(vo);
		System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Student registration failed");
			
		}
		finally {
			try {
				if(sc!=null)
					sc.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		//close container
		//((AbstractApplicationContext) ctx).close();
	}
}
