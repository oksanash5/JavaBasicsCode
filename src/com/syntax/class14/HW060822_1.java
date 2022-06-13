package com.syntax.class14;

public class HW060822_1 {
	
	void larger(int a, int b) {
		if (a>b) {
			System.out.println(a+ " is larger");
		}else if(b>a) {
			System.out.println(b+ " is lagrer");
		}else{
		System.out.println(a+ " and "+b+" equal");
	}
		}
	public static void main(String[] args) {
		
	
     HW060822_1 num=new HW060822_1();
     num.larger(15,5);
     
}
}