package com.syntax.class13;

public class HW060722_6 {

	public static void main(String[] args) {

 String a="Summer";
 String b="Spring";
 a=a+b;
 b=a.substring(0,a.length()-b.length());
 a=a.substring(b.length());
 
		System.out.println(a); 
		System.out.println(b);
		System.out.println(a);

	}

}
