package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		
	int sum=0;
	for(int i=1; i<6; i++) {
		sum+=i;
	}
	System.out.println(sum);  // only i time result=15 //(0+1)=(1+2)=(3+3)=(6+4)=10+5=15
	
	System.out.println("--------------");
	
	int sum1=0;
	for (int i=1; i<6; i++) {
		System.out.print(sum1+" ");   ///  0 1 3 6 10
		sum1+=i;
	}
	
	System.out.println("--------------------");
	
	int sum2=0;
	for (int i=1; i<6; i++) {
		sum2+=i;
		System.out.print(sum2+" ");//1 3 6 10 15
	}
	
	System.out.println("-----------------");
	
	 //write a program to find sum of all even numbers from 1 to 70
	
	int sum3=0;
	for (int i=1; i<=70; i++) {
		if (i%2==0) {
			sum3+=i;					
	}
		}
System.out.println("Sum of all even ="+ sum3);

// write a program to find sum of  all odd numbers from 1 to 70

System.out.println("-----------------------");

int sum4=0;
for (int x=1; x<=70;x++) {
	if(x%2!=0) {
		sum4+=x;
	}
}
System.out.println("Sum of all odd numbers ="+sum4);

System.out.println("-----------------");
//another way print sum both even add odd numbers in one statement
int sumEven=0;
int sumOdd=0;
for (int i=1; i<=70; i++) {
	if (i%2==0) {
		sumEven+=i;
	}else {
		sumOdd+=i;
	}
}
System.out.println("Sum even number is "+sumEven);
System.out.println("Sum odd number is "+sumOdd);
	}

}
