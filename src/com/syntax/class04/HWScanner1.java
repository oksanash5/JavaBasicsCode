package com.syntax.class04;

import java.util.Scanner;

public class HWScanner1 {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String firstName=input.next();
		
		System.out.println("Please enter your last name");
		String lastName=input.next();
		
		System.out.println("Please enter your state");
		String state=input.next();	
		
		System.out.println(firstName+" " + lastName + " lives in "+state);
		
 
	}

}
