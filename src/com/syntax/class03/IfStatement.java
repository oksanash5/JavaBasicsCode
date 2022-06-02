package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * declare a variable rate
		 * if rate is more than 5--> I am not buying a house
		 */
		
		double mortgageRate=5.5; //true  {}
		 if (mortgageRate>5) {
			 
		 System.out.println("I am not buying a house");
		 
		 //if (mortgageRate1<4.5) // false No {}
			 
		// we can not print/	 System.out.println("I am not buying a house");
			 
		/*
		 * declare 2 variable and check if num1 is bigger than num2
		 */
			 int num1=99;
			 int num2=10;
			 
			 if(num1>num2); {
				 System.out.println(num1+"is bigger than "+num2);
			 }
			  /*
			   * declare temperature, if temp is higher 75 -> I will go a walk
			   */
			 
			 int temp=78;
			 
			 if (temp>75) {
				 System.out.println("I will go for a walk");
			 }else {// otherwise. Code comes to else{}
				    // when condition is false
				 System.out.println("I am going to study Java");
				 
			 }
			  
			 int temp1=68;
			 if (temp1>75) {
				 System.out.println("I will go for a walk");
			 }else {// otherwise. Code comes to else{}
				    // when condition is false
				 System.out.println("I am going to study Java");
				 
				 
				 System.out.println("--------------------");
				 
				 
				 char gender='m';
				 
				 if (gender=='f') {
					  System.out.println("You like shopping");
					  
				 }else {
				  System.out.println("You like watching sports");
				 }
				 
				 System.out.println("------------------");
				 
				 String browser="fox";
				 
				 if(browser.equals("chrome")) {
					 System.out.println("All test cases will be executed on chrome");
				 }else {
					 System.out.println("I am not executing any test cases");
					 System.out.println("Reason - wrong browes");
					 
				 }
				 
			 }
			 
		 }
		 }
}

