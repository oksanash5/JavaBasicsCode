package com.syntax.class02;

public class Variable {

	public static void main(String[] args) {
		String name="Oksana";
		String lastName= "Shveigerdt";
		char grade='A';
		String city="Brooklyn";
		String state="NY";
		long phone=3478888888L;
		 
		
		//part A
		    System.out.println("My name is "+name+" and my last name is "+lastName);
			System.out.println("I am "+grade+" student");
			System.out.println("I live in city "+city+" and state "+state);
			System.out.println("And my phone number is "+phone);
			
		//part B	
		city="New Jersy";
		state="NJ";
		grade='B';
		phone=3475555555l;
		String cellphone="347-555-5555";
		
		System.out.println("My name is "+name+" and I moved to new city "
		                   +city+" new state "+state);
		System.out.println("My new phone number is "+phone);
		System.out.println("My new phone number is "+cellphone);
		
     /*
      * Rules for identifiers
      * 1. no space
      * 2. no keywords
      * 3. can not start with numbers(number can be used after the letter)
      * 4. can not start with special character(except _, S
      * 
      */
		//String break="Hello"; error
		//int 1number=10; error
		int number1=10;
		
		// int num%=20; error
		double $price=3.99;
		
		
		/*
		 * Naming Conventions
		 * follow camel casing
		 * variable/methods should start with lowercase and then follow camel casing
		 * class names should start with uppercase
		 */
		
		String mycity="Tysons";
		
	}

}
