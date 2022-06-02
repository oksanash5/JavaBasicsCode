package com.syntax.class06;

import java.util.Scanner;

public class Quz {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 
		String country, language;
		  
	         System.out.println("Please enter you country");
	         country=scan.nextLine();
	         
	         switch(country.toLowerCase()) {
	         
	         case "usa":
	        	System.out.println("english" );
	        	
	         case "russia":
	        	 System.out.println("russian");
	        	
	         case "germany":
	        	 System.out.println("deutsch");
	        	
	         case "china":
	        	 System.out.println("chinese");
	             
	          default:
	        	  System.out.println("unknow");
	         }
		
		}
 
 
	}


