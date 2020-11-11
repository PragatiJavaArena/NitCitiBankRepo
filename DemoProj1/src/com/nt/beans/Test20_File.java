package com.nt.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test20_File {

	public static void main(String[] args) throws IOException
	{
		FileReader fr=null;
		BufferedReader br=null;
       

		try{
			fr=new FileReader("number.txt");
			br=new BufferedReader(fr);
		   int a=Integer.parseInt(br.readLine());
		   int b=Integer.parseInt(br.readLine());
		   int c=a/b;

			System.out.println("FNO  "+a);
			System.out.println("SNO  "+b);
			System.out.println("Result  "+c);
		}
		
		catch(NumberFormatException e){
			System.out.println("both number must be integer");
		}
		catch(FileNotFoundException e){
			System.out.println("number.txt file is not available please create");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("please enter two integer");
		}
		catch(IOException e){
			System.out.println("connection closed");
		}


		catch(ArithmeticException e){
			System.out.println("second no should not 0(zero)");
		}
	 finally{
		 //resource releasing logic
		 //object un referencing logic 
		 //clean uo code
		 try{
			 br.close();
			 fr.close();
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	 }
		
	}
}
