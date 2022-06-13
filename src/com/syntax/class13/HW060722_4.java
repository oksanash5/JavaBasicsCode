package com.syntax.class13;

public class HW060722_4 {

	public static void main(String[] args) {
		String str="This is sentence I want to reverse";
		StringBuilder str1=new StringBuilder(str);
		str1.reverse();
		System.out.println(str1);//  all sentence//esrever ot tnaw I ecnetnes si sihT
		
		System.out.println("-----------------");
		
		 // Another way
		System.out.println(new StringBuilder(str).reverse());//all sentence//esrever ot tnaw I ecnetnes si sihT
		
		System.out.println("----------------");
		
		String str2="This is sentence I want to reverse";
		String[] arr =str2.split(" ");
		
		for(String arr2:arr) {
			System.out.print(new StringBuilder(arr2).reverse()+" ");//sihT si ecnetnes I tnaw ot esrever
		}
		
		System.out.println("------------------------");
		
		String str3="This is sentence I want to reverse";
		String[] arr1 =str3.split(" ");
		String fullReverse="";
		
		for (int i=0;i<arr1.length;i++) {
			String word=arr1[i];
			String rev="";
			
		for (int y=word.length()-1; y>=0;y--) {
			rev=rev+word.charAt(y);
		}
	fullReverse =fullReverse+rev+" ";
	
	}
	System.out.println(fullReverse);	
	}

}
