package com.syntax.class11;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
        //Using Scanner create an array of countries.
		//When an array is created, retrieve all values
		//from it and while retrieving those values print
		//capital for each country. (use 2 different loops).
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array that you want to create");
		int arraySize=scan.nextInt();
		String[]countryArray=new String[arraySize];////creating an array of size that will be enter by user
		 for (int i=0;i<countryArray.length;i++) {
			    countryArray[i]=scan.next();
		
	}
 for(String element:countryArray) {
	 if (element.equalsIgnoreCase("usa")) {
		 System.out.println("Washington DC");
	 }else if (element.equalsIgnoreCase("turkey")) {
		 System.out.println("Ankara");
	 }else if (element.equalsIgnoreCase("Thailand")) {
		 System.out.println("Bankok");
 }else {
	 System.out.println("contry hot supported by My Great java program version 1.0");}
 }
scan.close();
	}
	
}