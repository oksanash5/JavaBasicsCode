package com.syntax.class12;

public class HW060522_1 {

	public static void main(String[] args) {
		
	//String name1=new String("CLASS");	// 1 way to create string
  String name="CLASS";//2 way to create a string, best way

  if (!name.isEmpty()) {
	  if (name.length()%2!=0 && name.length()>=3) {
	 
		 int middle=name.length()/2;
		System.out.println(name.charAt(middle)); 		
	  
  }else {System.out.println("The string has even numbers");
   
  }
 
	}else {
		System.out.println("The string is empty");
	}
  }
}
