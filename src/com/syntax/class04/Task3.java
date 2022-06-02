package com.syntax.class04;

import javax.annotation.processing.SupportedSourceVersion;

public class Task3 {

	public static void main(String[] args) {
		
		boolean diploma=false;
		double gpaScore;
		if(diploma) {
			System.out.println("Congratulations!");
			gpaScore=3.2;
			if(gpaScore>=3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Try to get a degree");
		}
		
		System.out.println("--------------------");
		
	double morgageRate=4;
	double mortgagePrice;
	   if(morgageRate>4.5) {
		   System.out.println("You will not buy a house");
	   }else {
		   System.out.println("You will buy a house");
		
		   mortgagePrice=50000;
		if (mortgagePrice>50000) {
			System.out.println("You wiil take a loan");
		} else {
			
			System.out.println("You will pay cash");
		}
	   }
	
	
	}
	

}
