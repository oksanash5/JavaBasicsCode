package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// break - break block of code
       for (int i=1; i<=5; i++) {
	   System.out.println("hello");   //print only 1 time instead of 5 times
	   break;
   }
      System.out.println("----------------");
      
   boolean summer=true;
   while (summer) {
	   System.out.println("It is hot");  //print only 1 instead of infinite
	   break;
   }
   
   System.out.println("------------------");
   
   for (int i=1; i<=5; i++) {
	   System.out.println("hello"); // print 2 times  because until 2
	   if(i==2) {
	   break;
   }
   
	}
   System.out.println("------------------");
   
   boolean summer1=true;
   int temp=95;
   while (summer1) {
	   System.out.println("It is hot");// print 4 times
	   if(temp<70) {
		   System.out.println("It is not hot anymore");//print only 1
			   break;
		   }
	     temp-=10;
	}
	 
   
   }
	
}
	

