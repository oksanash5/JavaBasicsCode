package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
 // What is a Method:  Metod is a block of code a group of Java statements that 
	//are grouped together and
	//  we can execute thode statement buy Just creating an object of the class 
	//How: that contains that method and by writing the object name.method name
	
	void printHello() {
		System.out.println("How are you guys");
	}
	 boolean returnTrue() {
		 return true;
	 }
	  int returnInt() {
		  return 10;
	  }
	 
	 
	//Method that return something and Method that don't return something
  public static void main(String[] args) {
	MethodsDemo md=new MethodsDemo();
	md.printHello();
	
	boolean xs=md.returnTrue();
	
	int num=md.returnInt();
	System.out.println(num);//10
	System.out.println(md.returnInt());// the same 10
	
	
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
}
	

	}

	
