package com.syntax.class14;

public class HW060822_5 {
     String emailAddress(String username, String lastName, String emailType) {
    	 return username+lastName+"@"+emailType;
    	 
    	 
     }
public static void main(String[] args) {
	HW060822_5 word=new HW060822_5();
	System.out.println(word.emailAddress("Oksana","Shein","gmail"));
	
}
}
