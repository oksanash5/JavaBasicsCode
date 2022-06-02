package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		//print eve number from 20 to 1 
		// 1 way
     for(int i=20; i>=1; i-=2) {
	 System.out.print(i+" ");
 }
  System.out.println("--------------");
  
           //2 way
   for (int i=20;i>=1; i--) {
	   if(i%2==0) {
		   System.out.print(i+" ");
	   }
   }
   System.out.println("----------------");
   
   //print odd number from 20 to 50
              //1 way
     for (int i=21; i<=50;i+=2) {
    	 System.out.print(i+" ");
     }
     System.out.println("--------------");
     
     /// 2 way
     for (int i=20; i<50; i++) {
    	 if (i%2!=0) {
    		 System.out.print(i+" ");
    	 }
     }
	}

	
	
	}


