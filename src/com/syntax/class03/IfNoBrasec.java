package com.syntax.class03;

public class IfNoBrasec {

	public static void main(String[] args) {
		
		/*
		 * without braces Java can identify only
		 * 1 statement per block
		 */

  String time="Morning";
   if(time.equals("Morning")) 
	 
	   System.out.println("Say Good Morning");
         
   else 
	   System.out.println("Say Good day");
	   System.out.println("Or say good evening");
	   
   
   System.out.println("End of the code");
   System.out.println("make sure to use {} with if statement");
	}

}
