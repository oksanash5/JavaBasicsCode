package com.syntax.class06;

import java.util.Scanner;

public class HW051522_1 {

	public static void main(String[] args) {
		
         Scanner scan=new Scanner(System.in);
         
         String country, language;
         System.out.println("Please enter you country");
         country=scan.nextLine();
         
         switch(country.toLowerCase()) {
         
         case "usa":
        	language="english" ;
        	break;
         case "russia":
        	 language="russian";
        	break;
         case "germany":
        	 language="deutsch";
        	break;
         case "china":
        	 language="chinese";
             break;
         case "france":
        	 language="french";
        	break;
         case "kyrgyz republic":
        	 language="kyrgyz";
        	break;
          default:
        	  language="unknow";
         }
	System.out.println("You are from "+country+" and your language is "+language);
	}
	
	

}
