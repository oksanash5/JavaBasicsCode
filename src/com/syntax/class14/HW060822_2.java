package com.syntax.class14;

public class HW060822_2 {
	
	void isEvenOrOdd(int x) {
		if(x%2==0) {
			System.out.println(x+ " is even");
		}else {
			System.out.println(x+ " is odd");
		}
	}
    public static void main(String[] args) {
    	HW060822_2 num=new HW060822_2();
    	num.isEvenOrOdd(5);
}
}
