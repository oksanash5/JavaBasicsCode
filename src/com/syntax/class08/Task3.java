package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * declare a secret number
		 * you want to ask user to guess your secret number
		 * you code should keep asking to guess until user gets your secret number
		 * Once user gets the secret number-> you got it
		 */
		Scanner scan=new Scanner(System.in);
		
          int secNum=25;
          int num;      
       do {
    	   System.out.println("Please enter a number");
    	   num=scan.nextInt();
       }
    		   while (num!=secNum);
       { 	   
    	   System.out.println("Secret number is "+secNum);
       }

	}
	
	

}
