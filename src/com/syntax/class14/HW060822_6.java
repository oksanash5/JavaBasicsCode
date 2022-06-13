package com.syntax.class14;

public class HW060822_6 {

	boolean isPrime(int x) {
		boolean isPrime=true;
		if(x>1) {
			
			for(int i=2; i<x;i++) {
				if(x%i==0) {
			isPrime=false;
			break;
				}
			}
		
		}else {
			isPrime=false;
		}
		return isPrime;
	}
 public static void main(String[] args) {
	 HW060822_6 number=new HW060822_6();
	 System.out.println(number.isPrime(-1));
	 
	
}
}
