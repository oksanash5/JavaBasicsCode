package com.syntax.class06;

import java.util.Scanner;

public class HW051522_3 {

	public static void main(String[] args) {
		 
		Scanner scan=new Scanner(System.in);
		
		int num1, num2;
		int result=0;
		String operator;
		
		System.out.println("Please enter number 1");
		num1=scan.nextInt();
		
		System.out.println("Please enter number 2");
		num2=scan.nextInt();
		
		System.out.println("Please enter the operator");
         operator=scan.next();
         
         switch(operator) {
         case "+":
        	 result=num1+num2;
        	 break;
         case "-":
        	 result=num1-num2;
             break;
         case "*":
        	 result=num1*num2;
        	 break;
         case "/":
        	 result=num1/num2;
        	 break;    	 
         }
	System.out.println(num1+operator+num2+"="+result);
	}
	

}
