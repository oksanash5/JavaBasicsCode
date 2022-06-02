package com.syntax.class04;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class HWScanner2 {

	public static void main(String[] args) {
		
  Scanner myScanner=new Scanner(System.in);
   
  System.out.println("Please enter number1");
  int num1=myScanner.nextInt();
  
  System.out.println("Please enter number2");
  int num2=myScanner.nextInt();
  
  if (num1>num2){
	  System.out.println(num1+" is larger then "+num2);
  }else {
	  System.out.println(num2+" is larger then "+num1);
  }
  
  
  	}

}
