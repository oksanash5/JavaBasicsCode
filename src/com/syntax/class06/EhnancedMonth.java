package com.syntax.class06;

import java.util.Scanner;

public class EhnancedMonth {

 public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("what month were you born in? ");
	String month=scan.next();
	String season;
	
 if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Janyary")
		 || month.equalsIgnoreCase("February")) {
	season="Winter";
	 
}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")
		 || month.equalsIgnoreCase("May")) {
	 season="Spring";
	 
	 
}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July")
		 || month.equalsIgnoreCase("August")){
	season="Summer";
	
	 
}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
		 || month.equalsIgnoreCase("November")) {
	season="Fall";
	 
     }else {
	season ="Invalid";
}
 if(!season.equals("Invalid")) {
	 System.out.println("You were born in "+season);
 }
 }
 }