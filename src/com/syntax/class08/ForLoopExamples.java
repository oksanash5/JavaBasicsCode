package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// I need to print number from 1 to 90
		
        for (int i=1;i<=90; i++) {
        	System.out.print(i+" ");
        }
	System.out.println("----------");
	
        /*
	 * start point
	 * end point
	 * increment/decrement
	 */
	
	// I need number from 60 to 10
	for (int i=60; i>=10;i--) {
		System.out.print(i+" ");
	}
	System.out.println("--------------");
	
	for (int i=5; i<=40; i+=5) {//5 10 15 20...40
		System.out.print(i+" ");
	}
	System.out.println("----------");
	}
	

}
