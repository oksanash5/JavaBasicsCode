package com.syntax.class08;

import java.util.Scanner;

public class HW052222_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         
         String item;
         int price;
         int money=0;
         int paid=0;
               System.out.println("What do you want to buy and price");
               item=scan.nextLine();
               price=scan.nextInt();
               
          	   do {
          		   System.out.println("Please make a payment");
          		   money=scan.nextInt();
          		   paid+=money;
          	   
          	     if (paid<price) {    		  
            		 System.out.println("Your underpayment is "+(price-paid));
            		 
          	     }else if (paid>price) {
          	    	 System.out.println("Your overpayment is "+(paid-price));
            		 }
             } 
          	 while(paid!=price);  
              System.out.println("Thank you for shopping!");
	}

}
