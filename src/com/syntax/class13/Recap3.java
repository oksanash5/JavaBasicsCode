package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // from the String get the part which starts from the symbol # and end at the symbol #
		String str="I am Confused";
System.out.println(str.substring(5));// confused
System.out.println(str.substring(2));// am confused
System.out.println(str.substring(2,4));// am 
System.out.println(str.substring(0,1));// I,, start -0,  but before-1, not include 1
str="Asghar is Great";
System.out.println(str.substring(0,6));//Asghar
	}

}
