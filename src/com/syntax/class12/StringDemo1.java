package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		String name=new String("Oleg");//proper way of creating an object from a calss
		String name2="oleg"; // it's same as String name=new String("Oleg");
		// All the classes in Java can be treated as data types
		//if a class is present inside the same package or if a class belong to java.lan packages
       name.length();
       System.out.println(name.length());
       name2="Zammer ";
       System.out.println(name2.length());
       String name3="Oleg";
       System.out.println(name3.length());
       
       String captain="NAVEED";
       System.out.println(captain.toLowerCase());
       
       captain="I love Java";
       System.out.println(captain.toUpperCase());
       
       
       
	}

}
