package com.nt.beans;

public class TryWithReturn {

	public static void main(String[] args) {
		System.out.println(m1());
		
	}
		public static int m1() {
			try {
				System.out.println("in try");
				try {
					System.out.println("in inner try");
				return 10/0;
			}catch(NumberFormatException e){
			System.out.println("dont divide by zero");
			}
	}		
			finally {
				System.out.println("in finally");
				return 20;
			}
		//	System.out.println("after try //finally");
		//	return 20;
		}
	
}//class
