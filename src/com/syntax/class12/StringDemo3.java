package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str=" Batch 13 is Great";
      System.out.println(str.startsWith("Frozen")); // false
      System.out.println(str.startsWith(" Batch 13 is Great")); //true
      
      System.out.println(str.endsWith("t")); //true
      System.out.println(str.endsWith("Great")); //true
      System.out.println(str.endsWith("great")); //false
      System.out.println(str.toLowerCase().endsWith("great")); //true
      
      String name="Hamid";
      System.out.println(name.toLowerCase());// hamid
      System.out.println(name);  // HAMID
	
      
    
	System.out.println(str.contains("13"));//true
	System.out.println(str.contains("is")); //true
	System.out.println(str.contains("batch"));//false
	System.out.println(str.toLowerCase().contains("batch"));//true
	
	String query="13";
	System.out.println(str.contains(query)); //true
	
	}
	
	

}
