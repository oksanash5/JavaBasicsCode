package com.syntax.class09;

import javax.annotation.processing.SupportedSourceVersion;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char[]grade=new char[6];
  grade[0]='A';
  grade[1]='B';
  grade[2]='C';
  grade[3]='D';
  grade[4]='E';
  grade[5]='F';
  
  System.out.println(grade[1]);
   
  System.out.println("-----------------------");
  
  
  // Another way
char[]grade1= {'A','B','C','D','E','F'};
  
  System.out.println(grade1[1]);
  
  System.out.println("-------------------");
  
  /*System.out.println(grade[0]);
   * System.out.println(grade[1]);
   * System.out.println(grade[2]);
   * 
   * 
   */
  for (int i=0; i<grade.length; i++) {
	  
	  System.out.print(grade[i]+" ");
  }
  
  
 
  
  
	}

}
