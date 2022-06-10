package com.syntax.class14;

public class MethodDemo1 {
	
	
	void print() {	
		for( int i=0; i<5;i++) {
			System.out.println("Tara is great");
		}
	}
	
	void printManyTime(int times) {	
		for( int i=0; i<times;i++) {
			System.out.println("Tara is great");
		}
	}
	public static void main(String[] args) {
		MethodDemo1 md= new MethodDemo1();// creating the object of the class
		md.print();
		System.out.println("-------------");
		
		md.printManyTime(3);
		
	}

}
