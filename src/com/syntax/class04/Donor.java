package com.syntax.class04;

public class Donor {
	public static void main(String[] args) {
		
		int age=19,  weight=109;
		
		if (age>=18) {
			System.out.println("We should ask you weight");
			if (weight>=110) {
				System.out.println("You are eligible to donate your bood");
			}else {
				System.out.println("You are not eligible to donate your blood");
			}
		}else {
			System.out.println("We cannot accept you such a patient");
		}
		System.out.println("--------------------");		
		
		int year=15;
		int weight1=50;
		if (year>=18) {
			if (weight1>=100) {
				System.out.println("You are eligible to donate your bood");
			}else {
				System.out.println("You are not eligible to donate your blood");
			}
		}else {
			System.out.println("We cannot accept you such a patient");
		
		
	}


}}