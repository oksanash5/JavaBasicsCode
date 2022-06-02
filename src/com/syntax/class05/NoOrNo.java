package com.syntax.class05;

import java.util.Scanner;

public class NoOrNo {

	public static void main(String[] args) {
	

		  Scanner scan=new Scanner(System.in);

				System.out.println("Do you hace a credit card");
				String answer=scan.next();
				 if (answer.equalsIgnoreCase("yes")) {
					 System.out.println("What is balance on it");
					 int balance=scan.nextInt();
					 
					 if(balance>=1000) {
						 System.out.println("Please pay you balance immediatly");
					 }else {
						 System.out.println("You can spend more");
					 }
				 }else {
					 System.out.println("Let me offer a card");
				 }
			}

	}
	
	


