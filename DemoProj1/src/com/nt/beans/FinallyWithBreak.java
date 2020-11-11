package com.nt.beans;

public class FinallyWithBreak {

public static void main(String[] args) {
		
		for(int i=1; i<=10;i++) {
			System.out.println("IN  loop  "+i);
			try {
				System.out.println("in  try  "+i);
				
				if(i==5) {
				break;
				}
			}
			finally {
				System.out.println("in finally  "+i);
			//	System.out.println();
			}
			System.out.println("after try/finally");
			System.out.println();
		}
		System.out.println("after loop");

	}

}
