package com.syntax.class05;

import java.util.Scanner;

public class HW051422_3 {

	public static void main(String[] args) {
		 
		//Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, 
		//otherwise he is not. Once user is eligible and salary is larger than 50000 
	//than bonus = 5000, otherwise bonus=3000.
	Scanner scan=new Scanner(System.in); 
	
	System.out.println("Please enter your worked years");
	 float year=scan.nextFloat();
	  
	 if (year>=5) {
		 System.out.println("You eligible for the bonys");
		 System.out.println("Please enter your annual salary");
		 int salary=scan.nextInt();
		 
		 if (salary>=50000) {
			 System.out.println("You bonus = 5000");
		 }else {
			 System.out.println("You bonus = 3000");
		 }	 
	 }else {
		 System.out.println("You are not eligible for bonys");
	 }
		
	
	
	 }
	
	 }

