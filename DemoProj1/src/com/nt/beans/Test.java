package com.nt.beans;

public class Test {

	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example();
		e2.m1(e1);
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println();
		e1.m1(e2);
     System.out.println(e1.x);
     System.out.println(e2.x);
     System.out.println();
     e2.m1(e2);
     System.out.println(e1.x);
     System.out.println(e2.x);
     System.out.println();
     e1.m1(e1);
     System.out.println(e1.x);
     System.out.println(e2.x);
     System.out.println();
	}

}
