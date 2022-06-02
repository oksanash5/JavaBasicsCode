package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we need to check if repl was completed
		 * 
		 * if repl is complete we want to see
		 * if you did 15 and more--> great job
		 * if you did more than 10-> did good
		 * if less than 10-> try to complete all assignments
		 */
	boolean didRepl=true;
	int assignments;
	
	if(didRepl) {
		
		 System.out.println("How many assignment have you done");
		 assignments=7;
		
		 if(assignments>15) {
			System.out.println("You did a great jod");
		 }else if(assignments>10) {
			System.out.println("You did a good job");
		 }else{
			System.out.println("Please complete all Repl assignmnet");
		}
	}else {
		System.out.println("You should complete you Repl HW");
  }
	
 }
	
}
