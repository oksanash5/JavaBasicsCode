package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
		 String name="Oleg";
		 
		 String lastName="Smith";
		 
		 long phone=123456890L;
		 
		 //xxx-xxx-xxxx
		 
		String phoneNumber="123-456-7890";
		 
		String address="123 Washington str";
		 
		int age =30; //int age= 10;
		
		String city="Miami";
		
		//shortcut for printing
		//type syso +ctrl +Space ---> hit enter  (System.out.println();
		/*
		  * we can use+ - >works as concatenation operation
		  * to attach String to String
		  * to attach String to int
		  * to attach String to double
		  * to any other type
		  */
		
		System.out.println(name+" "+lastName);// Oleg Smith
		
		//Oleg lives in Maimi
		System.out.println(name+" lives in "+city);
		
		
		//Oleg is 30 year old
		
		
		System.out.println(name+" is "+age+" year old");
		
		
		
		
		
		
	}

}
