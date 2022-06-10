package com.syntax.class14;

public class MethodsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MethodsDemo3 md=new MethodsDemo3 ();
   System.out.println(md.sumNumbers(10,10));
   
   System.out.println("----------------------");
   
      md.printManyTime("Java",3);
	}

	
	int sumNumbers(int num1,int num2) {
		return num1+num2;
	}
      void printManyTime(String str, int times) {
     for (int i=0; i<times;i++) {
    	 System.out.println(str);
     }
}

}