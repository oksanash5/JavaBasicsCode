package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String firstName="Adam";
		String lastName=" jones";
		String fullName= firstName+lastName;//alway prefer this
		String fullName2=firstName.concat(lastName);//never use this because it can lead 
	  	                                            //you to nullpointer exception
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		String name=" ";
		System.out.println(name.isEmpty());//true without space "", false with space " "
	//	System.out.println(name.isBlank());
		
		String name1=" never ";
		System.out.println(name1.trim());// only remove space before and after word, not inside/between
		
		
		
	}

}
