package com.syntax.class05;

import java.util.Scanner;

public class HW051422_1 {

	public static void main(String[] args) {
		              
		               //HW#1 
		//You are a loan specialist and 
		//you need to ask user what is the amount of loan is needed. 
		//If loan is less or equal to 200,000 then you would lend the money
		//otherwise you would reject the client.
 
		Scanner myScan=new Scanner(System.in);
		
		System.out.println("What is the amount of loan you needed?");
		int loanAmount=myScan.nextInt();
		
		if(loanAmount<=200000) {
			System.out.println("We woild lend the money");
		}else {
			System.out.println("Unfortunately, we reject the loan");
		}

	                            
	   
		
	}
	
	
	

}
