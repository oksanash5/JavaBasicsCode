package com.syntax.class10;

public class HWGroup10 {

	public static void main(String[] args) {
		
         //Write a java program to find 
		//the second largest number in the array?
		
		int[]num= {100,260,1800,-35,95,1200,1000};
		int largest=0;
		int secondLarg=0;
		for (int n=0; n<num.length; n++) {
			
			if (num[n]> largest) {
				secondLarg=largest;
				largest=num[n];	
			}else if(num[n]>secondLarg)  {
				secondLarg=num[n];
			}
		
			}
  System.out.println("The second largest number in the array is "+secondLarg);
			;
		}	
					
					}
			 
	    	  
		
        	    

	
	
	


