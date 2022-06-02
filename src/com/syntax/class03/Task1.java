package com.syntax.class03;

public class Task1 {

	public static void main(String[] args) {
	 //Declare variable and increase it’s value by 500 and then by 200 using shorthand operator
	//Declare variable and decrease it’s value by 60 using shorthand operator
	//Declare variable cakePiece=11 and divide the value of that variable between 4 people 
	//using shorthand operator
	//Declare variable cake=25 and divide cake between 7 people . 
	//Using shorthand operator found out how many pieces of cake left
	//after it was distributed equally among 7 people
		 
		   int val=100;
		  val+=500;
		  System.out.println(val);
		  
		  val+=200;
		  
		  System.out.println(val);
		  
		  int val1=50;
		  val1-=60;
		  
		  System.out.println(val1);
		  
		  int cakePiece=11;
		  cakePiece/=4;
		  
		  System.out.println(cakePiece);
		  
		  int cake=25;
		  System.out.println(cake/7);
		  
		  cake%=7;
		  
		  System.out.println(cake);
		  
	}

}
