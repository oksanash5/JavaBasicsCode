package com.syntax.class05;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Enter day");
   int day=scan.nextInt();
   
     if((day==1)||(day==2)||(day==3)||(day==4)||(day==5)){
    	 System.out.println("It is a weekday");
     }else if((day==6)|| (day==7)){
    	 System.out.println("It is a weekend");
     }else {
    	 System.out.println("Invalid day");
     }
      
     
     System.out.println("-------------------");
     
     System.out.println("Enter day");
     int day1=scan.nextInt();
     
       if((day1>=1)&& day1<=5){
      	 System.out.println("It is a weekday");
       }else if((day1>=6 && day1<=7)){
      	 System.out.println("It is a weekend");
       }else {
      	 System.out.println("Invalid day");
       }
        
       
       System.out.println("-------------------");
       
	}

}
