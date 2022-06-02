package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		//while loop first checks condition
		//and only then executes block of code
    int num=1;
    while (num<=3) {
    	System.out.print(num + " ");
    	num++;
    	
    }
    System.out.println("----------");
    // do while first executes the code
    // and only then checks the condition
    
      int num1=1;
      do {
    	  System.out.print(num1 +" ");
    	  num1++;
      }while (num1<=3);
    
    System.out.println("--------------");
    
    int a=10;
    while(a<=3) {// false
    	System.out.println(a+" ");// no output
    	a++;	
    }
     
    System.out.println("----------------------");
    
    int num2=10;
    do {
    	System.out.print(num2+" ");// only show do 10
    	num2++;
    }while(num2<=3);// false condition
    
    System.out.println("-----------");
    
    // print numbers 1 to 30 using do while
    int num3=1;
    do {
    	System.out.print(num3+" ");
    	num3++;
    }while(num3<=30);
    
    System.out.println("----------------");
    
    // print even number from 70 to 30
    
    int num4=70;
    do {
    	System.out.print(num4+" ");
    	num4-=2;
    }while(num4>=30);//70-30
    
    System.out.println(num4);//28
    
    System.out.println("---------------");
    
 
	}

}
