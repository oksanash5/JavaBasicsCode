package com.syntax.class05;

import java.util.Scanner;

public class Tasc1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("We will issue a driver license");
		}else {
			System.out.println("We will offer a learner's permit");
		}

	}

}
