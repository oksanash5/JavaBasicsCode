package com.syntax.class09;

public class HW052822_3 {

	public static void main(String[] args) {
		double[]num= new double[5];
		num[0]=10.99;
		num[1]=25;
		num[2]=-3.99;
		num[3]=201.5;
		num[4]=-80;
		
		for (int n=0; n<num.length; n++) {
			System.out.print(num[n]+" ");
		}
	System.out.println("--------------");
	
	double[] num1= {50.0, -12.99, 25.99, 107.60, 1002.85};
	for (double nb:num1) {
		System.out.print(nb+" ");
	}
	}

}
