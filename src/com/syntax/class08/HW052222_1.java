package com.syntax.class08;

import java.util.Scanner;

public class HW052222_1 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 int num1, num2;
		 int a=0;
		 int sumEv=0;
		 int sumOd=0;
		 System.out.println("Please enter start point and end point of range");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 
		 for (a=num1; a<=num2; a++) {
			 if(a%2==0) {
				 sumEv+=a;
			 }else {
				sumOd+=a; 
			 }		 
		 }
System.out.println("Sum Even numbers = "+sumEv+" and Sum Odd number = "+sumOd);
	}

}
