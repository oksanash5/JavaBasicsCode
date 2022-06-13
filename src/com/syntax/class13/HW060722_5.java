package com.syntax.class13;

import java.util.Scanner;

public class HW060722_5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("In:");		
		String str=scan.nextLine();
		boolean pal=true;
		
		String newString=str.replace(" ","");
		
		System.out.println(newString);
		
		newString=newString.toLowerCase();
		String backWords="";
		for(int i=newString.length()-1;i>=0;i--) {
			backWords+=newString.charAt(i);
		}
		
		System.out.println(backWords);
		
       if(newString.equals(backWords)) {
    	   pal=true;
       }else {
    	   pal=false;
       }
	System.out.println(pal);
	}
}
