package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		int[]array= {5,28,36,1,14,56,48,17};
		int max= array[0];
		for(int i=1;i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		
		}
		
System.out.println("The largest element is " +max);

System.out.println("-------------------");

     max=array[0];
     for(int num:array) {
    	 if(num>max) {
    		 max=num;
    		 
    	 }
     }
     System.out.println("The largest element is " +max);
	}

}
