package com.syntax.class11;

import java.util.Scanner;

public class Dog {

	//attributes how the object will look like
	 String name;	
	 int age;
	 double weigth;
	 String color;
	 double height;
	 String breed;
	 //how that object behave
	 void bark() {
		 System.out.println("Dog barks");
	 }	 
	 void walks() {
		 System.out.println("Dog walks");
	 }
     void eat() {
	 System.out.println("dogs like to eat done");
	
     }
     public static void main(String[] args) {
    	 
    	Scanner scan=new Scanner(System.in);   //ctrl+click on windows	
    	//scan.next();
    	 Dog jimmy=new Dog();// creating an object and storing in variable
    	 jimmy.name="Jimmy";
    	 jimmy.age=6;
    	 jimmy.weigth=16;
    	 jimmy.color="Pink";
    	 jimmy.breed="German";
    	 jimmy.bark();
    	 
    	 
    	 
    	 
	
}	}


