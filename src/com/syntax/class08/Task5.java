package com.syntax.class08;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          
          String answer;
          String card="yes";
          do {
        	 System.out.println("Do you want to apply for a credit card?"); 
        	 answer=scan.nextLine();
          
          } while(!answer.equalsIgnoreCase(card));
        	  
          System.out.println("Let start it!");
          scan.close();
          
          }
	

	}
