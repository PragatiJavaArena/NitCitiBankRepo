package com.nt.beans;

public class TryWithBreakReturnContinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("in   loop   "+i);
			try {
				System.out.println(" in try");
				if(i==5) {
					//see the output by un commenting below statement one by one 
					//break;
					//return;
					continue;
				}
			}//try
			finally {
				System.out.println("in finally");
			}
			System.out.println("after try /finally");
		}
		System.out.println("after loop");

	}

}
