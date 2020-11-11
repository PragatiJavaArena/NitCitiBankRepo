package com.nt.beans;

public class Test19_TryCatch {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println("FNO   "+a);
			System.out.println("SNO   "+b);
			System.out.println("Result   "+c);
			
			}
		catch(ArithmeticException e) {
			System.out.println("second number should not 0 zero");
		}
		catch(NumberFormatException e) {
			System.out.println("Both number must be Integer");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter two integer");
		}
		
	}

}
