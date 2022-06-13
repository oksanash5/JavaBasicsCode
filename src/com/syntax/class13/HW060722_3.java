package com.syntax.class13;

public class HW060722_3 {

	public static void main(String[] args) {
		String str="Is it satuday? Is it raining? We have a Java class today.";
         System.out.println(str.split("[ ]").length);// 12 word
         System.out.println(str.split("[?.]").length);// 3 sentence
         
         System.out.println("--------------");
         
         int counter=0;
         for(int i=0;i<str.length();i++) {
        	 if(str.charAt(i)=='?') {
        		 counter++;
        		 
        	 } 	
		
	}
         System.out.println(counter);
}
}