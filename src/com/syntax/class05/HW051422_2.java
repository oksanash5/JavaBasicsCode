package com.syntax.class05;

import java.util.Scanner;

public class HW051422_2 {

	public static void main(String[] args) {
		
		//Create a Java program that will ask user to input city and temperature.
		//Your program should convert Fahrenheit into celsius 
		//and print “The temperature is the city __ is __”
              Scanner myScan=new Scanner(System.in);
              
              System.out.println("Please input your city");
              String city=myScan.next();
              
              System.out.println("Please input your temperature");
             int temp=myScan.nextInt();
              
             int temp1=(temp-32)*5/9;
            		  System.out.println("The temperature is the city "+city+" is "
                      +temp1+" celsius");
            		  
	}
	

}
