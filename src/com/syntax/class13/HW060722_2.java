package com.syntax.class13;

public class HW060722_2 {

	public static void main(String[] args) {
		
      String sentence="abfte1256&^%@";
   String sentenceAN=sentence.replaceAll("[^A-Za-z0-9]","");
   System.out.println(sentenceAN.length());
     
	}

}
