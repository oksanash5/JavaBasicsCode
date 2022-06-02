package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String offer;
		
		System.out.println("Did you get a job");
		offer = scan.nextLine();
		
		
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("did you get a jod");
			offer = scan.nextLine();
		}
System.out.println("Congratulation!");
	}

}
