package com.syntax.class06;

import java.util.Scanner;

public class HW051522_2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		char grade;
		String score;
		
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		case 'A':
			score="Excellent";
			break;
		case 'B':
			score="Good";
			break;
		case 'C':
			score="Average";
			break;
		case 'D':
			score="Bad";
			break;
		default:
			score="Not Acceptable";		
		}
       System.out.println("You grade is "+grade+ " and your score is "+score);
	}

}
