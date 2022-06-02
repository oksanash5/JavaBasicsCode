package com.syntax.class05;

import java.util.Scanner;

public class HW051422_5 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);

		 System.out.println("Please enter your birth month"); 
		 String month=scan.next();
		 
		 if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Janyary")
				 || month.equalsIgnoreCase("February")) {
			 System.out.println("Winter");
			 System.out.println("You were born in Winter");
			 
		 }else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
				 || month.equalsIgnoreCase("May")) {
			 System.out.println("Spring");
			 System.out.println("You were born in Spring");
			 
		 }else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
				 || month.equalsIgnoreCase("August")){
			 System.out.println("Summer");
			 System.out.println("You were born in Summer");
			 
		 }else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				 || month.equalsIgnoreCase("November")) {
			 System.out.println("Fall");
			 System.out.println("You were born in Fall");
		}else {
			System.out.println("Please enter valid month");
		}
	      
	}
	

}
