package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		
		//Print only odd number from 100 to 1
		//1 way
		int num=99;
		while(num>=1) {
			System.out.print(num+" ");
			num-=2;
		}
		  System.out.println("------------------");
		  
		  // 2 way
         int a=100;
         while(a>=1) {
        	 if (a%2!=0) {
        		 System.out.print(a+" ");		
        	 }
                  a--;
         }
         
	}

}
