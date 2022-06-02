package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {
		 
		int num=-25;
		if(num>0) {
			System.out.println("The "+num+" is positive");
		}else if(num==0){
			//else if(num=0) error, since condition is not boolean
			System.out.println("The "+num+" is not negative or positive");
		}else {
			System.out.println("The "+num+" is negative");
		}
				

	}

}
