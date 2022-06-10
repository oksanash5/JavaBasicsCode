package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
     String str="Sammer is funny Sammer is gulbadan and he is sheer badan"; // sexy and strong
     System.out.println(str.charAt(2));//m
     System.out.println(str.charAt(5)); // r
     
     int counter =0;
      // for (int i=0; i<str.length(); i++)  {System.out.println(str.charAt(i));}//all letter
     for (int i=0; i<str.length(); i++) {
    	if ('s'==str.charAt(i) || 'S'==str.charAt(i) || 'a'==str.charAt(i) ||'A'==str.charAt(i)) {
    		counter++;
    	}
     }
   System.out.println("a and s appeared " +counter+ " in the string");  
   

	}

}
