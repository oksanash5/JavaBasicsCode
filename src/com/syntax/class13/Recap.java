package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Batch 13 is great but i say this to every batch. I was kidding";
  System.out.println(str.length());// count all character including space
  
  int len=str.length();
  System.out.println(str.toUpperCase()); // just displaying
  
  str=str.toUpperCase();// reassign updater to UpperCase
  str="";
  System.out.println(str.isEmpty()); //true
  
  String str2="   Tara";
  System.out.println(str2.trim()); //remove space before or after
  
  str="Batch 13 is great but i say this to every batch. I was kidding";
  System.out.println(str.contains("batch"));//true/ find word or characters inside the string
  
  System.out.println(str.startsWith("Batch")); //if it start with this word
  System.out.println(str.endsWith("ing")); // if it end wth this letter
	}

}
