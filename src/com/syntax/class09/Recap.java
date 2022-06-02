package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for (int i=1; i<=5; i++) {
	  continue;
	// System.out.println("Hello");// unreachable code
	// break;  // unreachable code
  }
  
  
  for (int a=1; a<=5; a++) {
	  System.out.println("hello "+a);// 5 times
	  
	  for (int y=1; y<=3; y++) {
		  System.out.println("Bye "+y); //only 1 times not 3 and again to begining  to first for
		  break;
	  }
 
  }
	System.out.println("-----------------------");
	
	for (int a=1; a<=5; a++) {
		  System.out.println("hello "+a);// 5 times
		  
		  for (int y=1; y<=3; y++) {
			  
			  continue;
		//	  System.out.println("Bye "+y); //0 times just run 3 times
	}

}}}
