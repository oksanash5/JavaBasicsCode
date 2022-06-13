package com.syntax.class14;

public class HW060822_4 {
	
	void langauge(String country) {
		String hello;
		switch(country) {
		case "USA":
			hello="Hello";
            break;
		case "Russia":
			hello="Privet";
             break;
		case"China":
			hello="Fdaddd";
		case "France":
	       hello="Bonjour";
           break;

	       default:
	    	   hello="Country not found";
	
}
      System.out.println(hello);
	}
	public static void main(String[] args) {
  	  HW060822_4 word=new HW060822_4();
  	  word.langauge("Canada");
}
}