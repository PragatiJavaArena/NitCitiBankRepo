package com.nt.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nAppTest {

	public static void main(String[] args) {
	 Locale locale=null;
	 ApplicationContext ctx=null;
	 JFrame  frame=null;
	 JButton b1=null,b2=null,b3=null,b4=null;
	 JLabel lab1=null,lab2=null,lab3=null,lab4=null;
	 JTextField tno=null,tname=null,tadd=null;
	 String sno=null,sname=null,sadd=null,cap1=null,cap2=null,cap3=null,cap4=null;
	 //create IOC container of ApplicationContext type
	 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	 //create locale object
	 locale=new Locale(args[0],args[1]);
	 //locate the properties file
	 
	 //String labels by submitting keys
	 sno=ctx.getMessage("sno.label",new Object[] {"customer"}, "msg1",locale);
	  sname=ctx.getMessage("sname.label",new Object[] {},"msg2",locale);
	 sadd=ctx.getMessage("sadd.label",new Object[] {},"msg3",locale);
	 cap1=ctx.getMessage("btn1.cap",new Object[] {},"msg4",locale);
	 cap2=ctx.getMessage("btn2.cap",new Object[] {}, "msg5",locale);
	 cap3=ctx.getMessage("btn3.cap",new Object[] {}, "msg6",locale);
	 cap4=ctx.getMessage("btn4.cap",new Object[] {},"msg7",locale);
	
	  
	 //create JFrame
	 frame=new JFrame();
	 frame.setLayout(new FlowLayout());
	 frame.setSize(300,300);
	 frame.setBackground(Color.BLUE);
	 frame.setTitle("I18n Application");
	 
	 //adding one by one labels on frame
	 lab1=new JLabel(sno);
	 frame.add(lab1);
	 tno=new JTextField(10);
	 frame.add(tno);
	 
	 
	 lab2=new JLabel(sname);
	 frame.add(lab2);
	 tname=new JTextField(10);
	 frame.add(tname);
	 
	 lab3=new JLabel(sadd);
	 frame.add(lab3);
	 tadd=new JTextField(10);
	 frame.add(tadd);
	 
	 b1=new JButton(cap1);
	 b2=new JButton(cap2);
	 b3=new JButton(cap3);
	 b4=new JButton(cap4);
	 
	 frame.add(b1);
	 frame.add(b2);
	 frame.add(b3);
	 frame.add(b4);
	 
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 //close container
	 ((AbstractApplicationContext) ctx).close();
	 
	 
	// System.out.println(sno+"   "+sname+"  "+sadd+"   "+cap1+ "   "+cap2+"   "+cap3+"   "+cap4);
	 

	}

}
