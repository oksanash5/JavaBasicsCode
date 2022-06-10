package com.syntax.class12;

import java.util.Scanner;

public class HW060522_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("Mom's first name?");
         String mamName=scan.nextLine();
         System.out.println("Dad's first name?");
         String dadName=scan.nextLine();
         System.out.println("Boy or Girl");
         String baby=scan.nextLine();
       
         String mamName1=mamName.substring(0,(mamName.length()/2));
         String mamName2=mamName.substring((mamName.length()/2));
         String dadName1=dadName.substring(0,(dadName.length()/2));
         String dadName2=dadName.substring((dadName.length()/2));
          
         if (baby.equalsIgnoreCase("Boy")) {
        	 System.out.println("Suggested baby name "+dadName1+mamName2);	 
         } if (baby.equalsIgnoreCase("Girl")) {
        	 System.out.println("Suggested baby name "+mamName1+dadName2);
         }
	}

}
