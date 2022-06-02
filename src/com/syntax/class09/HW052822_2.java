package com.syntax.class09;

public class HW052822_2 {

	public static void main(String[] args) {
		String[] animals= {"Tiger","Lion", "Bear","Wolf","Fox" };
		for (int a=0; a<animals.length; a++) {
			System.out.print(animals[a]+" ");
			}
	System.out.println("-----------------");
	
	String[] animal=new String[5];
	animal[0]="Lion";
	animal[1]="Tiger";
	animal[2]="Fox";
	animal[3]="Bear";
    animal[4]="Wolf";
     for( String fAnimal:animal) {
    	 System.out.print(fAnimal+" ");
     }
	
	}

}
