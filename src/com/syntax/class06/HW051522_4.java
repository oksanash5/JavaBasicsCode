package com.syntax.class06;

import java.util.Scanner;

public class HW051522_4 {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
         
		 int num1, num2; ;
		 String operator;
		 int result=0;
		 
		 System.out.println("Please enter number 1");
		 num1=scan.nextInt();
		 
		 System.out.println("Please enter number 2");
		 num2=scan.nextInt();
		 
		 System.out.println("Please enter operator");
		 operator=scan.next();
		 
		 if (operator.equals("+")) {
			 result=num1+num2;	 
		 }else if (operator.equals("-")) {
			 result=(num1-num2);
		 }else if(operator.equals("*")){
		      result=(num1*num2);	
		 }else if (operator.equals("/")) {
			 result=(num1/num2);	 
		 }	 
		 System.out.println(num1+operator+num2+"="+result);	 
	}

}
