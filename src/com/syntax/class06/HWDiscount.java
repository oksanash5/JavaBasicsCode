package com.syntax.class06;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
		 
		 String sale;
		 String item;
		 double price=0;
		 int discount=0;
		 double salePrice=0; 
		 double tDiscount=0;
		 
		 System.out.println("Is there any sale?");
		 sale=scan.next();
		 
		 if(sale.equalsIgnoreCase("yes")) {
			 System.out.println("Which item you want to buy?");
			 item=scan.next();
			 
			 System.out.println("How much do you want to spend?");
			 price=scan.nextDouble();
			 
			 if(price<20) {
				 discount=10; 
			 }else if(price>=20 && price<100) {
				 discount=20; 
			 }else if(price>=100 && price<500) {
				 discount=30; 
			 }else if(price>500) {
				 discount=50; 
			}
			tDiscount=price*discount/100; 
		    salePrice= price - tDiscount;
		    
			 System.out.println("After discount "+discount+"% the price of the item "
		 		+" reduce from $"+price+ " to $"+salePrice+ " and you save $"+tDiscount);
		 }
		 
		 else {
			 System.out.println("You are not going to shopping");
			 
		 }

	}


	}


