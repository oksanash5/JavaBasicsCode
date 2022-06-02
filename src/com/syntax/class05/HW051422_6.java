package com.syntax.class05;

import java.util.Scanner;

public class HW051422_6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		double quiz=scan.nextDouble();
		
		System.out.println("Please enter your mid term score");
         double midTerm=scan.nextDouble();
         
         System.out.println("Please enter your final score");
         double finalScore=scan.nextDouble();
         
         double avgScore=(quiz+midTerm+finalScore)/3;
         
         if(avgScore>=90) {
        	 System.out.println("You avegare score = " +avgScore+" and you grade = A");
         }else if(avgScore>=70 && avgScore<90) {
        	 System.out.println("You avegare score = " +avgScore+" and you grade = B");
         }else if(avgScore>=50 && avgScore<70) {
        	 System.out.println("You avegare score = " +avgScore+" and you grade = C");
         }else if(avgScore<50) {
        	 System.out.println("You avegare score = " +avgScore+" and you grade = F");
         }
         
	}

}
