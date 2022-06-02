package com.syntax.class10;

public class HW {

	public static void main(String[] args) {
		double[]num= {2.99, 3.99, 4.99,5};
		for (double x:num) {
			System.out.print(x+" ");
		}
      System.out.println("---------------");
      
      for (int i=0; i<num.length; i++) {
    	  System.out.print(num[i]+" ");
      }
	System.out.println("-------------");
	
	System.out.println(num[0]+num[1]+num[2]+num[3]);
	
	  System.out.println("-------------------");
	  
	int[] numbers= {10,222,3,4,5};
	int sum=0;
	for(int i=0;i<numbers.length; i++) {
		sum = sum+numbers[i];
	}
	System.out.println(sum);
	
	System.out.println("-------------------");
	
	int[] number= {10,222,3,4,5};
	int sum1=0;
	for(int i=0;i<number.length; i++) {
		sum1+=number[i];
	}
	System.out.println("Sum of all elements = "+sum);
	
	System.out.println("---------------");
	
	sum1=0;// reassigning
	for(int n:number) {
		sum1+=n;
		
	}
	
	System.out.println("Sum of all elements ="+sum1);
	
	
	}

}
