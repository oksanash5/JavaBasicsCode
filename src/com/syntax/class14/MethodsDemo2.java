package com.syntax.class14;

public class MethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodsDemo2 md=new  MethodsDemo2();
		 
		 System.out.println(md.isEven(2));
		 
		 System.out.println(md.checkString("hello"));
	}

	boolean isEven(int number) {// it could be in any place but outside the main
		if (number%2==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	boolean checkString(String str) {
		if (str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
