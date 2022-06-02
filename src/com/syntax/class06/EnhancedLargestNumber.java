package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=200;
		int num2=200;
		int num3=200;
		
		/*
		 * compiler can initialize variables to it's default value
		 * int->0
		 * double->0.0
		 * boolean-> false
		 * String->null
		 */
		
		int largest=0;  ///  instead of     int largest;
		 
		if(num1>num2 && num1>num3) {
			largest=num1;
			
		}else if(num3> num1 && num3>num2) {
			largest=num3;
		}else if(num2>num1 && num2>num3) {
			largest=num2;
		}else {
			System.out.println("All number are equal");
			
		}
		
		if(largest !=0) {
	System.out.println("The largest is " +largest);
	//The variable largest may not have been initialized
	
	}
	
	}

}

