package com.syntax.class06;

import java.util.Scanner;

public class HW051522_5 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 String sale;
		 String item;
		 double price=0;
		 int discount=0;
		 double salePrice=0;
		 
		 System.out.println("Is there any sale?");
		 sale=scan.next();
		 
		 if(sale.equalsIgnoreCase("yes")) {
			 System.out.println("Which item you want to buy?");
			 item=scan.next();
			 
			 System.out.println("How much do you want to spend?");
			 price=scan.nextDouble();
			 
			 if(price<20) {
				 discount=10; salePrice=price*0.90;
			 }else if(price>=20 && price<100) {
				 discount=20; salePrice=price*0.80;
			 }else if(price>=100 && price<500) {
				 discount=30; salePrice=price*0.70;
			 }else if(price>500) {
				 discount=50; salePrice=price*0.50;
			}
		 System.out.println("After discount "+discount+"% the price of the item "
		 		+" reduce from $"+price+ " to $"+salePrice);
		 }
		 
		 else {
			 System.out.println("You are not going to shopping");
			 
		 }

	}

}
