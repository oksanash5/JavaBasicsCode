package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		//continue - skips current execution/iteration
     // when java executes continue->
		//go back to the beginning of the loop;
		//so rest be skipped/ignore
		
		for (int i=1; i<=5; i++) {
			if (i==2) {
			continue;
			}
			System.out.println(i+" ");  ///print everything without num 2///1, 3 , 4 ,5
			System.out.println("Hello");
			System.out.println("we are going on break soon");
		}
	
		
		System.out.println("------------------------");
	// print number from 1 to 10 except number 5 and 7
		
		for (int i=1; i<=10; i++) {
			if (i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
}
}
