package com.syntax.class07;

public class Even {

	public static void main(String[] args) {
		
		//print number from1 to 20 but only eve number
		// 1 way
		int num=1;
		while (num<=20) {
			if(num%2==0) {
				System.out.print(num+" ");
				}
				num++;
			
		}
			System.out.println("----------------");
			
			//2 way
            int num1=2;	
			while (num1<=20) {
				System.out.print(num1+" ");
				num1+=2;
			}
	}}


