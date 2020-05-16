package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class JavaConfigAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle vehicle=null;
		
		//create IOC container of ApplicationContext type
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get the bean class object
		vehicle=ctx.getBean(Vehicle.class);
		
		//invoke method
		vehicle.journey("hyd","goa");
		
		//close the container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
