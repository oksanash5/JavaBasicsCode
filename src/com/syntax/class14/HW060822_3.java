package com.syntax.class14;

public class HW060822_3 {

	void palindrome(String str) {
		
		StringBuilder newStr=new StringBuilder(str);
		newStr.reverse();
		
		String reverseStr=newStr.toString();
		if(str.equalsIgnoreCase(reverseStr)) {
			System.out.println(str+ " is palindrome");
		}else {
			System.out.println(str+ " is not palindrom");
		}
	}
      public static void main(String[] args) {
    	  HW060822_3 word=new HW060822_3();
    	  word.palindrome("AnNa");
	
}
}
