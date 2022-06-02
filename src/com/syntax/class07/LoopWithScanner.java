package com.syntax.class07;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if got a job
		 * we will continuosly asking of you get a job untill you say yes!
		 * 
		 * once you say yes -> Congratulation!
		 */

		Scanner scan=new Scanner(System.in);
		String job;
		
		do {
		System.out.println("Did you get a job");
		job=scan.nextLine();
		}while(!job.equalsIgnoreCase("yes"));
		
		System.out.println("Congratulations");
		
		System.out.println("---------------");
		
		Scanner input=new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job");
		offer=input.nextLine();
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job");
			offer=input.nextLine();
	
		}	
	System.out.println("Congratulations");	
	}

}
