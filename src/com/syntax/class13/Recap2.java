package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="Where is sameer?";
  System.out.println(str.charAt(3));//r
  //System.out.println(str.charAt(-3)); // error
  
  System.out.println(str.indexOf("i")); //6
  System.out.println(str.indexOf("e")); // only shoe first letter
  System.out.println(str.indexOf("e",6)); // start search from 6(0..5), ignore all character before index 6
    
  System.out.println(str.indexOf("r",5));
  
  for (int i=0; i<str.length();i++) {
	  if (str.charAt(i)=='e') {
		  System.out.print(i+" ");//2 4 12 13// print all indext nnumber
	  }
  }
  System.out.println("---------------");
  int counter=0;
  for (int i=0; i<str.length();i++) {
	  if (str.charAt(i)=='e') {
		  counter++;
	//	  if (counter==4) {
			  System.out.println(i);
			  }
		  }
		  
  
  
  
	}

}
//}