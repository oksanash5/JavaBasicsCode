package com.syntax.class06;

import java.util.Scanner;

public class Enhancedcode {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("Please enter your quiz score");
			int quiz=scan.nextInt();
			
			System.out.println("Please enter your mid term score");
	         int midTerm=scan.nextInt();
	         
	         System.out.println("Please enter your final score");
	        int finalScore=scan.nextInt();
	         
	         int averageS=(quiz+midTerm+finalScore)/3;
	         System.out.println("You average score " +averageS);
	         
	         char grade;
	         
	         if(averageS>=90) {
	        	 grade='A';
	 	 
	         }else if(averageS >=70 && averageS<=90) {
	             grade='B';
	       
	         }else if(averageS >=50 && averageS<70) {
	        	 grade='C';
	        	 
	         }else {
	        	 grade='F';
	         }
	         System.out.println("You are a "+grade+" student");
	         
	        // if you A or B student-> you are doing great
	         // otherwise->please try to study more
	         
	         if(grade=='A' || grade=='B') {
	        	 System.out.println("You are doing great");
	         }else {
	        	 System.out.println("Please try to study more ");
	         }
	}
	
	

}
