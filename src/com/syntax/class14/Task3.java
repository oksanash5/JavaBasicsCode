package com.syntax.class14;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="This is sentence i want to reverse";
   
   String []arr=str.split(" ");
   for (String s:arr) {
	   System.out.print(new StringBuilder(s).reverse()+" ");
	   
 // new SrtingBulder(s) object os StringBulder is created
   }
	System.out.println("-------------");
	System.out.print(new StringBuilder(str).reverse()+" ");
	
	}

}
