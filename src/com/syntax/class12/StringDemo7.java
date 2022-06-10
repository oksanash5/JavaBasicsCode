package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="I am always confused";
  
  System.out.println(str.indexOf('c'));//12
  System.out.println(str.indexOf("am"));//2
  System.out.println(str.indexOf("always"));//5
  System.out.println(str.indexOf('a'));//2
  System.out.println(str.indexOf(' '));//1
  System.out.println(str.indexOf('z')); //-1 / if letter is not present in string
	}

}
