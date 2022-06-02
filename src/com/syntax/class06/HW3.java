package com.syntax.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		   boolean loan;
		   int creditScore=0;
		   String eligibility="null";
		   System.out.println("Do you need a loan?");
		   loan=scan.nextBoolean();
		   if (loan){
		     creditScore=scan.nextInt();
		     if (creditScore<600){
		       eligibility="Not eligible";
		     }else if(creditScore>=600 && creditScore<=700){
		       eligibility="Maybe eligible";
		     }else if(creditScore>=701 && creditScore<=800){
		       eligibility="Eligible";
		     }else if(creditScore>801){
		       eligibility="Definitely eligible";
		     }
		     System.out.println("The eligibility is "+eligibility);
		}else {
			 System.out.println("The eligibility is Unknown");
		}
		}
	

}
