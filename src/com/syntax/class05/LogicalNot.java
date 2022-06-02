package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		 boolean boo=true;
		 System.out.println(boo);
		 
		 boolean boo1=!false;
		 System.out.println(boo1);
 /*
  * if there is no traffic->I will reach work in time
  */
		 	 
		boolean traffic=true;
		if(!traffic) {
			System.out.println("I will reach work in time");
		}
		
		 String name="Rase";
		 if(!name.equals("Emre")) {
			 System.out.println("You a not Emre, and I need Emre");
		 }
	}

}
