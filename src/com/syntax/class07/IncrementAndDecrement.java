package com.syntax.class07;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=10;
		
		x=x+1;
		x+=1;
		System.out.println(x);//12
		
		x++;//increment value of variable by1
		System.out.println(x); //13
		
		x--; //decrement value of variable by1
		System.out.println(x); //12
		
		// increment and decrement operators work only with variable
		//10++ CE: Invalid argument to operation
		
		int num=100;
		num++;
		
		System.out.println(num);
			}

}
